import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.err.println("Usage: java Main <input_file>");
            // default for debugging
            // args = new String[]{"Testing/fact.cl"};
            return;
        }

        String inputFile = args[0];
        
        try {
            FileInputStream inputStream = new FileInputStream(inputFile);
            ANTLRInputStream input = new ANTLRInputStream(inputStream);
            
            // Phase 1: Lexer
            cool_grammar lexer = new cool_grammar(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // Phase 2: Parser
            cool_syntaxParser parser = new cool_syntaxParser(tokens);
            parser.setBuildParseTree(true);
            parser.removeErrorListeners();
            parser.addErrorListener(new ErrorHandling()); // Re-use ErrorHandling from Phase 2 via copy or assume present if copied
            
            ParseTree tree = parser.program();
            
            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.err.println("Compilation halted due to syntax errors.");
                System.exit(1);
            }

            // Phase 3: Semantic Analysis
            SemanticAnalyzer analyzer = new SemanticAnalyzer();
            analyzer.analyze(tree);
            
            System.out.println("Compilation successful (Semantic Analysis Passed).");

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
