package Day11;
import java.util.*;
public class LinkedListEx {

	public static void main(String[] args) {
		
	
	LinkedList l1=new LinkedList();
	 l1.add(123);
	 l1.add("rahul");
	 l1.add(45.0f);
	 l1.add('c');
	 
	 
	 System.out.println(l1);
	 
	 System.out.println(l1.contains(123));
	 System.out.println(l1.size()); 
	 System.out.println(l1.remove());
	 System.out.println(l1.size());
	 System.out.println(l1.getFirst());
	 System.out.println(l1.getLast());
	 
	
	}

}
