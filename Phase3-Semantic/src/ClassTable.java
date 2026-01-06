import java.util.*;

public class ClassTable {
    private Map<String, ClassNode> classes;

    public ClassTable() {
        classes = new HashMap<>();
        installBasicClasses();
    }

    private void installBasicClasses() {
        // Object
        addClass("Object", null);
        ClassNode obj = classes.get("Object");
        obj.addMethod("abort", Arrays.asList("Object"));
        obj.addMethod("type_name", Arrays.asList("String"));
        obj.addMethod("copy", Arrays.asList("SELF_TYPE"));

        // IO
        addClass("IO", "Object");
        ClassNode io = classes.get("IO");
        io.addMethod("out_string", Arrays.asList("String", "IO"));
        io.addMethod("out_int", Arrays.asList("Int", "IO"));
        io.addMethod("in_string", Arrays.asList("String"));
        io.addMethod("in_int", Arrays.asList("Int"));

        // Int
        addClass("Int", "Object");
        
        // String
        addClass("String", "Object");
        ClassNode str = classes.get("String");
        str.addMethod("length", Arrays.asList("Int"));
        str.addMethod("concat", Arrays.asList("String", "String"));
        str.addMethod("substr", Arrays.asList("Int", "Int", "String"));

        // Bool
        addClass("Bool", "Object");
    }

    public boolean addClass(String name, String parent) {
        if (classes.containsKey(name)) {
            System.err.println("Error: Class " + name + " is already defined.");
            return false;
        }
        classes.put(name, new ClassNode(name, parent));
        return true;
    }

    public ClassNode getClass(String name) {
        return classes.get(name);
    }

    public boolean isDefined(String name) {
        return classes.containsKey(name);
    }

    // Check for inheritance cycles and validity
    public boolean validate() {
        boolean errors = false;
        
        // 1. Check if Main exists
        if (!classes.containsKey("Main")) {
            System.err.println("Error: Class Main is not defined.");
            errors = true;
        }

        // 2. Check parents
        for (ClassNode c : classes.values()) {
            if (c.name.equals("Object")) continue;
            
            String parent = c.parentName;
            if (!classes.containsKey(parent)) {
                System.err.println("Error: Class " + c.name + " inherits from undefined class " + parent);
                errors = true;
                continue;
            }

            if (parent.equals("Int") || parent.equals("String") || parent.equals("Bool")) {
                 System.err.println("Error: Class " + c.name + " cannot inherit from basic class " + parent);
                 errors = true;
            }
        }
        
        // 3. Check for cycles (basic check)
        for (String name : classes.keySet()) {
            if (name.equals("Object")) continue;
            Set<String> visited = new HashSet<>();
            String curr = name;
            while (curr != null && !curr.equals("Object")) {
                if (visited.contains(curr)) {
                    System.err.println("Error: Inheritance cycle detected involving " + name);
                    errors = true;
                    break;
                }
                visited.add(curr);
                if (classes.get(curr) == null) break; // Should be caught by parent check
                curr = classes.get(curr).parentName;
            }
        }

        return !errors;
    }
    
    // Check type conformance (is type1 a subtype of type2?)
    public boolean conforms(String type1, String type2) {
        if (type1.equals(type2)) return true;
        if (type1.equals("Object")) return false; // Object only conforms to Object
        
        ClassNode node = classes.get(type1);
        if (node == null) return false; // meaningful error handling later
        
        // Walk up the tree
        String parent = node.parentName;
        while (parent != null) {
            if (parent.equals(type2)) return true;
            ClassNode pNode = classes.get(parent);
            if (pNode == null) break;
            parent = pNode.parentName;
        }
        return false;
    }
    
    // Least Upper Bound
    public String lub(String type1, String type2) {
        if (conforms(type1, type2)) return type2;
        if (conforms(type2, type1)) return type1;
        
        // Walk up type1 until we find something type2 conforms to
        String curr = type1;
        while(curr != null) {
            if (conforms(type2, curr)) return curr;
            ClassNode node = classes.get(curr);
            if (node == null) break;
            curr = node.parentName;
        }
        return "Object";
    }

    // Find a method in the class or its ancestors
    public List<String> getMethodSignature(String className, String methodName) {
        String curr = className;
        while (curr != null) {
            ClassNode node = classes.get(curr);
            if (node != null && node.methods.containsKey(methodName)) {
                return node.methods.get(methodName);
            }
            curr = (node != null) ? node.parentName : null;
        }
        return null;
    }
}
