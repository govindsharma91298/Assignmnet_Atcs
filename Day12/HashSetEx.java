package Day12;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet h1=new HashSet();
		
		for (int i=0;i<10;i++) {
			h1.add(i);
		}
		
		h1.add("Govind");
		h1.add("rahul");
		
		System.out.println(h1);
	}

}
