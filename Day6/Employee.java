package Day6;

public class Employee {

	int empid;
	String empname;
	
	public Employee(int empid,String empname) {
		this.empid=empid;
		this.empname=empname;
	}
	
	public String toString() {
		return empid+" "+empname;
	}
}
