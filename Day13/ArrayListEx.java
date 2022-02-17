package Day13;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(68);
		obj.add(false);
		obj.add(null);
		obj.add(45.0f);
		obj.add("govind");
		
		Iterator itr = obj.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		
	    
}

		


	}

}
