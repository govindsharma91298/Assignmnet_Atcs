package Day10;

public class constructChain {
	public constructChain() {
		this(98);
		System.out.println("this is default constructor");
		
		
	}
	public constructChain(int p)
	{
		System.out.println("this is paramterized construtor "+p);
		
	}
	

	public static void main(String[] args) {
		constructChain x=new constructChain();
	}

}
