package Day11;
import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList();
		
		
		al.add("rahul");
		al.add("govind");
		al.add("mahul");
		al.add("nikhil");
		al.add("arun");
		
		System.out.println(al);
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext()) {
			
			
			System.out.println(itr.next());
		}
		
	}

}
