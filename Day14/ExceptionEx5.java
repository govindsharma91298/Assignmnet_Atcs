package Day14;

public class ExceptionEx5 {
   
    public void pass(int marks) {
		
		if (marks<5)
			throw new ArithmeticException("You got:"+marks+" from 10. You need to word hard");
		
		else
		{
			System.out.println("You got:"+marks+". Good");
		}
	 }
  public static void main(String[] args) {
	
	 ExceptionEx5 obj= new ExceptionEx5();
	 obj.pass(2);
	 System.out.println("welcome");
	}
}


