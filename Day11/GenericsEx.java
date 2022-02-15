package Day11;
import java.util.*;

//Create a class with generics(perticular type integer) and add the values print even numbers

public class GenericsEx {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList();
		
		for(int i=0;i<=10;i++) {
			a1.add(i);
		}
		
		for (Object o:a1) {
			Integer i=(Integer) o;
			if (i%2==0)
			System.out.println(i);
		}
		
	}

}
