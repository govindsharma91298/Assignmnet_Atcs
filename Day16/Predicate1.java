package Day16;

import java.util.function.Predicate;

public class Predicate1 {
	public static void main(String[] args) {
		//Predicate<String> p2=i->i.length()>6;
		
		String[] s= {"Niharika","Manisha","Mansi","Riya"};
		Predicate<String> p2=i->i.length()>6;
		
		for(String s1:s) {
			if(p2.test(s1)) {
				System.out.println(p2.test(s1));
			}
		}
		
	}

}