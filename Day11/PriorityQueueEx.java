package Day11;
import java.util.Iterator;

import java.util.PriorityQueue;


public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue<String> pq= new  PriorityQueue<String>();
		
		pq.add("shruthi");
		pq.add("vedika");
		pq.add("anmol");
		pq.add("kohli");
		pq.add("ranganath");
		
		System.out.println("head:"+pq.element());
		System.out.println(pq);
		
		Iterator itr=pq.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		pq.remove();
		pq.poll();
		System.out.println(pq);
		
		itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	

	}

