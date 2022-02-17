package Day13;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedKistEx {

	public static void main(String[] args) {
		
		LinkedList<Number> obj = new LinkedList<Number>();
		obj.add(68);
		obj.add(89.0f);
		obj.add(null);
		obj.add(45.0f);
		obj.add(78.00);
		
		Iterator itr = obj.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
	
		}

	}
}


