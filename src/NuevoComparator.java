import java.util.ArrayList;
import java.util.Comparator;


public class NuevoComparator implements Comparator<ArrayList<String>>{

	ArrayList<Integer> indexes;
	ArrayList<String> isDesc;
	
		
	public NuevoComparator(ArrayList<Integer> indexes, ArrayList<String> isDesc) {
		this.indexes = indexes;
		this.isDesc = isDesc;
	}

	@Override
	public int compare(ArrayList<String> arg0, ArrayList<String> arg1) {
		int comp=0;
		for(int i=0;i<indexes.size();i++){
			if(arg0.get(indexes.get(i)).equals("null") || arg1.get(indexes.get(i)).equals("null")){
				if(arg0.get(indexes.get(i)).equals("null") && !arg1.get(indexes.get(i)).equals("null")){
					comp = 1000;
				}
				else if(!arg0.get(indexes.get(i)).equals("null") && arg1.get(indexes.get(i)).equals("null")){
					comp = -1000;
				}
				else{
					comp = 0;
				}
			}
			else{
				try{
					float elem1 = 0.0f, elem2 = 0.0f;
					elem1 = Float.parseFloat(arg0.get(indexes.get(i)));
					elem2 = Float.parseFloat(arg1.get(indexes.get(i)));
					if(elem1>elem2){
						comp = 1;
					}
					else if(elem1<elem2){
						comp = -1;
					}
					else{
						comp = 0;
					}
				}
				catch (Exception e){
					comp = arg0.get(indexes.get(i)).compareTo(arg0.get(indexes.get(i)));
				}
			}
			//Ver si es ascendente o descendente
			if(isDesc.get(i).equals("DESC")){
				comp = -comp;
			}
			if (comp!=0){
				return comp;
			}
		}
		return comp;
	}

}
