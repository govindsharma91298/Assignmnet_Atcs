package Day16;

public class Demo3 {

	public static void main(String[] args) {

		Demo2 d = new Demo2();

		new Thread() {

			public void run() {
				d.withdraw(6000);
			}
		}.start();

		new Thread() {

			public void run() {
				d.deposite(2000);
			}
		}.start();

	}
}
