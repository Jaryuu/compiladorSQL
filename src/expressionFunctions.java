import java.util.ArrayList;


public class expressionFunctions {

	expressionFunctions(){
	}
	
	public boolean ExpAnd(ArrayList<String> expresion){
		if (expresion.size()==1){
			return ExpOr(expresion);
		}
		else{
			ArrayList<String> exp00 = new ArrayList<String>();
			ArrayList<String> exp02 = new ArrayList<String>();
			exp00.add(expresion.get(0));
			exp02.add(expresion.get(2));
			
			boolean exp = ExpAnd(exp00);
			boolean exp2 = ExpAnd(exp02);
			return (exp && exp2);
					
		}
		
	}
	
	public boolean ExpOr(ArrayList<String> expresion){
		if (expresion.size()==1){
			return ExpEq(expresion);
		}
		else{
			ArrayList<String> exp02 = new ArrayList<String>();
			ArrayList<String> exp03 = new ArrayList<String>();
			exp02.add(expresion.get(0));
			exp03.add(expresion.get(2));
			
			boolean exp = ExpOr(exp02);
			boolean exp2 = ExpOr(exp03);
			return (exp || exp2);
		}
	}
	
	public boolean ExpEq(ArrayList<String> expresion){
		if (expresion.size()==1){
			return ExpGL(expresion);
		}
		else{
			ArrayList<String> exp02 = new ArrayList<String>();
			ArrayList<String> exp03 = new ArrayList<String>();
			exp02.add(expresion.get(0));
			exp03.add(expresion.get(2));
			
			boolean exp = ExpEq(exp02);
			boolean exp2 = ExpEq(exp03);
			return (exp == exp2);
		}
	}
	
	public boolean ExpGL(ArrayList<String> expresion){
		return true;
	}
	
	public boolean ExpUniFactor(ArrayList<String> expresion){
		return true;
	}
	
	public boolean ExpFactor(ArrayList<String> expresion){
		return true;
	}
}
