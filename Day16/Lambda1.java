package Day16;
interface P{
	public void demo();
	
}
public class Lambda1{
	public static void main(String[] args) {
		P i=()->System.out.println("hello");
		i.demo();
	}
}
