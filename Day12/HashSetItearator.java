package Day12;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetItearator {

	public static void main(String[] args) {
		HashSet pq=new HashSet();
		
		
		pq.add("shruthi");
		pq.add("vedika");
		pq.add("anmol");
		pq.add("kohli");
		pq.add("ranganath");
		
		
		Iterator itr=pq.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
