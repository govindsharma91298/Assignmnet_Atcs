package Day15;

public class ThreadDemo {

	public static void main(String[] args) {
		ThreadEx m1=new ThreadEx();
		m1.start();
		
		System.out.println("main thread");
	}

}
