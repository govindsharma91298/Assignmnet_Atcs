package Day15;

public class ThreadDemoEx {

	
		public static void main(String[] args) { //
			
			ThreadEx1 d= new ThreadEx1();
			ThreadEx1 d1= new ThreadEx1();
			
			d.start();
			d1.start();
			
			d.setName("soma");
				
			//System.out.println("main thread");
			
			System.out.println("mai thread before"+Thread.currentThread().getName()); //main
			
			Thread.currentThread().setName("Sathya");
			System.out.println(Thread.currentThread().getName());
		}

	}


