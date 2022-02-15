package Day11;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
	

			
				
				
				HashSet hs= new HashSet();
				
				for(int i=0;i<=10;i++) {
					System.out.println(hs.add(i));
				}
				
				hs.add("anjali");
				hs.add("raju");
				hs.add(78);
				hs.add(45.06);
				hs.add('h');
				hs.add("anjali");
				hs.add(null);
				System.out.println(hs);
				
			}

	}


