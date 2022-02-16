package Day12;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		LinkedHashSet l1=new LinkedHashSet();
		
		for(int i=0;i<10;i++){
			l1.add(i);
		}
		l1.add("govind");
		l1.add("sharma");
		System.out.println(l1);
		
	}

}
