package Day15;

public class ThreadEx1 extends Thread {
	public void run() {
		System.out.println("child thread");//thread-0
		System.out.println("child before"+Thread.currentThread().getName());
		
		//System.out.println(Thread.currentThread().setName("soma"));
		
		System.out.println(Thread.currentThread().getName());
	}
	
}

