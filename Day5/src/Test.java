public class Test {
	static int a=10;
	int b=9;
	public void display(int a, int b) {
		System.out.println("a+b= "+(a+b));
	}
	public static int blah(int s ,int j) {
		return s+j;
	}
	

	public static void main(String[] args) {
		System.out.println("hello");
		Test obj=new Test();
		obj.display(5, 6);
		
         System.out.println(blah(3,4));
	}

}
