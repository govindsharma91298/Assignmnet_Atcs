
public class Calculator2 {
	int c;
	public int m1(int a,int b) {
		  c=a+b;
		 return c;
	}
	public void Display(int a ,int b) {
		 c=a+b;
		 System.out.println(c);
	}

	public static void main(String[] args) {
		Calculator2 c1=new Calculator2();
		System.out.println(c1.m1(2, 3));
		c1.Display(4,8);

	}

}
