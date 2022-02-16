package Day12;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			LinkedHashSet pq=new LinkedHashSet();
			
			
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
