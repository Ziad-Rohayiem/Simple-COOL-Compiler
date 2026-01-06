import java.io.*;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputFile = (args.length > 0) ? args[0] : "Testing/fact.cl";
        FileWriter file = new FileWriter(inputFile + "-ast");
        BufferedWriter writer = new BufferedWriter(file);
        FileInputStream inputStream = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(inputStream);
        cool_grammar lexicalAnalyzer = new cool_grammar(input);
        CommonTokenStream tokens = new CommonTokenStream(lexicalAnalyzer);
        cool_syntaxParser parser = new cool_syntaxParser(tokens);
        parser.setBuildParseTree(true);
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorHandling());
        cool_syntaxParser.ProgramContext tree = parser.program();
        writer.write(tree.toStringTree());

        writer.close();
        System.out.println(tree.toStringTree(parser));
        // Trees.inspect(tree, parser);
    }
}

