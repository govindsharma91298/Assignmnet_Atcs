package Day16;


public class RunEx{
		public static void main(String[] args) {
			MyRunnable mr=new MyRunnable();
			Thread t=new Thread(mr);
		t.start();
			
			
			
		}
	}



