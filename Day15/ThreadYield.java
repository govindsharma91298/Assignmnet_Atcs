package Day15;

class MyYield extends Thread {

	public void run() {
		Thread.yield();
		for(int i=0; i<3; i++) {
			System.out.println("child thread");
		}
		
	}
}

public class ThreadYield {
	public static void main(String[] args) {

		MyThread mt = new MyThread();

		mt.start();
		
		
		for(int i=0; i<3; i++) {
			System.out.println("main thread");
		}
		
	}
}
