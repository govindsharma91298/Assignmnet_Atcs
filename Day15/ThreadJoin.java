package Day15;

class MyJoin extends Thread {

	public void run() {
		
		for(int i=0; i<3; i++) {
			System.out.println("child thread");
		}
		
	}
}

public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException {

		MyJoin mt = new MyJoin();

		mt.start();
		mt.join();
		
		for(int i=0; i<3; i++) {
			System.out.println("main thread");
		}
		
	}
}
