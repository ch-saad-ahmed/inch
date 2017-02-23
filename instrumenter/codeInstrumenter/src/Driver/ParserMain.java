package Driver;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

public class ParserMain {

	
	public static String application = "Blink";

	public static String basePath = "/home/saad/tinyOS/tinyos/tinyos-main/apps/";
	public static transient String inputFilePath = basePath + application + "/build/telosb/app.c";
	public static transient String tempFilePath = basePath + application + "/build/telosb/app1.c";
	
	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter(tempFilePath);
		CharStream chStream = new ANTLRFileStream(inputFilePath);
		CLexer lexer = new CLexer(chStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		TokenStreamRewriter rewritetokens = new TokenStreamRewriter(tokens);

		CParser parser = new CParser(tokens);

		parser.tokens = rewritetokens;
		parser.start();
		String translatedCode = parser.tokens.getText();
		pw.println(translatedCode);
		pw.close();

	}
	
}