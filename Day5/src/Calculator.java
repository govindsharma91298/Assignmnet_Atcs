
public class Calculator {
       public static int m1(int a ,int b) {
    	   int c=a+b;
    	   return c;
       }
       public static void m2(int a,int b) {
    	   int c=a+b;
    	   System.out.println(c);
       }
	
	
	public static void main(String[] args) {
		Calculator.m2(23, 22);
		System.out.println(Calculator.m1(1, 2));
		

	}

}
