package Day16;

interface I{
	 public static void mi() {
		 System.out.println("hello default");
		
	}
}

public class DefaultEx implements I{
  public	void mi() {
		System.out.println("hello me");
	}
  public static void main(String[] args) {
	I.mi();
}

}
