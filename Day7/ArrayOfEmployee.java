package Day7;

public class ArrayOfEmployee {
	int empid;
	String empname;
	
public	ArrayOfEmployee(int empi,String empn){
	
	empid=empi;
	empname=empn;
		
	


	System.out.println("Employee id: " + empid + "Employee name: "+empname);
}
	

	public static void main(String[] args) {
	ArrayOfEmployee obj[]=new ArrayOfEmployee[2];
	  obj[0]=new ArrayOfEmployee(1,"Govind");
	  obj[1]=new ArrayOfEmployee(2,"rahul");
	  
		
	}

}
