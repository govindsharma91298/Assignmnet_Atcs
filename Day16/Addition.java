package Day16;
interface U{
	public void s1(int a,int b);
}
public class Addition {

	public static void main(String[] args) {
		U add=(a,b)->System.out.println(a+b);
		add.s1(34, 45);

	}

}
