package Day15;


class MyThread extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getPriority());

	}
}
public class ThreadDemo4 {
	public static void main(String[] args) {

		MyThread mt = new MyThread();

		mt.start();
		

		System.out.println(Thread.currentThread().getPriority());

	}

}
