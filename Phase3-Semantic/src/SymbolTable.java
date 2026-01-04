import java.util.*;

public class SymbolTable {
    private Stack<Map<String, String>> scopes;

    public SymbolTable() {
        scopes = new Stack<>();
        enterScope(); // Global/Class scope
    }

    public void enterScope() {
        scopes.push(new HashMap<>());
    }

    public void exitScope() {
        if (!scopes.isEmpty()) {
            scopes.pop();
        }
    }

    public boolean add(String name, String type) {
        if (scopes.isEmpty()) return false;
        Map<String, String> currentScope = scopes.peek();
        if (currentScope.containsKey(name)) {
            return false; // Already declared in this scope
        }
        currentScope.put(name, type);
        return true;
    }

    // Lookup in the current scope only (e.g., for duplicate checking)
    public String probe(String name) {
        if (scopes.isEmpty()) return null;
        return scopes.peek().get(name);
    }

    // Lookup in all scopes (e.g., usage)
    public String lookup(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            if (scopes.get(i).containsKey(name)) {
                return scopes.get(i).get(name);
            }
        }
        return null;
    }
}
