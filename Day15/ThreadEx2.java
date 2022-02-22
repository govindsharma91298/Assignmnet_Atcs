package Day15;

public class ThreadEx2 {
	public void run() {
		System.out.println("child");
		System.out.println("child thread :"+Thread.currentThread().getPriority()); //1,
	}
}
