package Day11;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListiteratorEx {

	public static void main(String[] args) {

		ArrayList<String> al= new ArrayList();
		
		al.add("sweety");
		al.add("mayank");
		al.add("mahul");
		al.add("uma");
		al.add("arun");
		
		System.out.println(al);

		System.out.println("FORWARD DIRECTION");
		ListIterator ltr=al.listIterator();
		
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		
		
		System.out.println("reverse direction");
		
		
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
		
		
	}

}
