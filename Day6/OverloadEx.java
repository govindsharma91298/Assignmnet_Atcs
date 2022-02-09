package Day6;

public class OverloadEx {

	public void add(int a,int b,int c) {
		System.out.println("addition of three int numbers :"+(a+b+c));
	}
	public void add(int a,int b) {
		System.out.println("addition of two int numbers :"+(a+b));
	}
	public void add(float a,float b) {
		System.out.println("addition of two float numbers :"+(a+b));
	}
	public void add(float a,int b) {
		System.out.println("addition of  float,int numbers :"+(a+b));
	}
	public void add(int a,float b) {
		System.out.println("addition of int, float numbers :"+(a+b));
	}
public static void main(String[] args) {
	
	OverloadEx obj= new OverloadEx();
	
	obj.add(67, 34);
	
	obj.add(45.0f, 85);
	
	obj.add('a', 'c'); //type promotion
	
}
}