import java.util.*;

public class ClassNode {
    String name;
    String parentName;
    Map<String, String> attributes; // name -> type
    Map<String, List<String>> methods; // name -> listOfParamTypes (return type is last)
    
    public ClassNode(String name, String parentName) {
        this.name = name;
        this.parentName = parentName;
        this.attributes = new HashMap<>();
        this.methods = new HashMap<>();
    }

    public void addAttribute(String name, String type) {
        attributes.put(name, type);
    }

    public void addMethod(String name, List<String> signature) {
        methods.put(name, signature);
    }
}
