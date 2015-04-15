/* Universidad del Valle de Guatemala
 Abril de 2015
 Julio Ayala - 12362
 Ricardo Zepeda - 12311
 Bases de datos
 VerboseListener.java para generacion de errores sintacticos 
*/

import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Recognizer;

public  class VerboseListener extends BaseErrorListener {
	private String error = "";
	public void syntaxError(Recognizer<?, ?> recognizer,Object offendingSymbol, int line,int charPositionInLine,String msg,RecognitionException e) {
		List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
		Collections.reverse(stack);			
		System.err.println("line "+line+":"+charPositionInLine+" at "+
		offendingSymbol+": "+msg);
		//error = "line "+line+":"+charPositionInLine+" at "+	offendingSymbol+": "+msg;
		error += "line "+line+":"+charPositionInLine+" -->: "+msg+"\n";
	}
	public String getError(){
		return error;
	}
	public void setError(String error){
		this.error = error;
	}
}

