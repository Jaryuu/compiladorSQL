import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.antlr.runtime.RecognitionException;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

import java.util.*;

public class ANTLR {
	
	
	private String is;
	private ANTLRInputStream input;
	private SQLLexer lexer;
	private CommonTokenStream tokens;
	private SQLParser parser;
	private ParseTree tree;
	private TreeViewer viewr;
	private boolean error, errorST, bWarning;
	private VerboseListener errorListener;
	private DBVisitor visitor;

	
	public ANTLR(String is){		
		this.is = is;
		input = new ANTLRInputStream(is);
		lexer = new SQLLexer(input);
		tokens = new CommonTokenStream(lexer);
		parser = new SQLParser(tokens);
		parser.removeErrorListeners();
		errorListener = new VerboseListener();
		parser.addErrorListener(errorListener);
		tree = parser.todo(); // parse; start a program
		visitor = new DBVisitor();		
		if (parser.getNumberOfSyntaxErrors()>0){
			error = true;
			System.out.println("\n"+parser.getNumberOfSyntaxErrors());
			System.out.println(errorListener.getError());
		}else{			
			error = false;
			visitor.visit(tree);
			// JULIO AHI ESTA TU COMENTARIO
		}
		
		
	}
	public void createGUITree(){
		viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewr.setScale(1.5);//scale a little
	}
	public TreeViewer getViewr(){
		return viewr;
	}
	public VerboseListener getErrorListener() {
		return errorListener;
	}
	public void setErrorListener(VerboseListener errorListener) {
		this.errorListener = errorListener;
	}
	public boolean getError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	
	
	public boolean isErrorST() {
		return errorST;
	}
	public void setErrorST(boolean errorST) {
		this.errorST = errorST;
	}
	
	public boolean isbWarning() {
		return bWarning;
	}
	
	public void setbWarning(boolean bWarning) {
		this.bWarning = bWarning;
	}
	public DBVisitor getVisitor() {
		return visitor;
	}
	public void setVisitor(DBVisitor visitor) {
		this.visitor = visitor;
	}
	
}

