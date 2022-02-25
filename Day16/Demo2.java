package Day16;

class Demo2 {
	int amount = 5000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw money");

		if (this.amount < amount) {
			System.out.println("LESS BALANCE ...WAITING FOR DEPOSITE");

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.amount -= amount;
			System.out.println("withdrwa is completed");
		}
	}

	synchronized void deposite(int amount) {
		System.out.println("going to deposite");
		this.amount += amount;
		System.out.println("deposite is completed");
		notify();
	}

}

