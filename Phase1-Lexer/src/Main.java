import java.io.*;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {

        String inputFile = (args.length > 0) ? args[0] : "Testing/fact.cl";
        String outputFile = "Testing/output.txt"; 

        try {
            // Create input stream from file
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inputFile));

            // Instantiate the lexer
            cool_grammar lexer = new cool_grammar(input);

            // Create a token stream using the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create a FileWriter to write tokens to output file
            FileWriter writer = new FileWriter(outputFile);

            // Iterate over tokens and write them to output file
            tokens.fill();
            for (Token token : tokens.getTokens()) {
                writer.write(token.getText() + " : " + cool_grammar.VOCABULARY.getSymbolicName(token.getType()) + "\n");
            }

            // Close the writer
            writer.close();

            System.out.println("Tokens have been written to " + outputFile);
        } catch (IOException e) {
            System.err.println("Error reading or writing files: " + e.getMessage());
            System.exit(1);
        }
    }
}
