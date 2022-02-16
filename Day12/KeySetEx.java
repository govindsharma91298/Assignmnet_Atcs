package Day12;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class KeySetEx {

	public static void main(String[] args) {
	     

	     
	 		  TreeMap<Integer,String> t = new TreeMap();
	 		
	 		  t.put(111,"albert");
	 		  t.put(222, "john");
	 		  t.put(333, "robert");
	 		  t.put(444, "marry");
	 		
	 		 System.out.println(t);
	 		
	 		 Set<Integer> keys = t.keySet();
	 		
	 		Iterator itr = keys.iterator();
	 		while(itr.hasNext()) {
	 			System.out.println(itr.next());
	 		}
	 	   }

	}


