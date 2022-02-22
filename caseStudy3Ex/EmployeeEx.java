package caseStudy3Ex;

public class EmployeeEx {
	private String Empname;
	private int Emppin;
	private String Address;
	private String Email;
	public EmployeeEx(String empname, int emppin, String address, String email) {
		super();
		this.Empname = empname;
		this.Emppin = emppin;
		this.Address = address;
		this.Email = email;
	}
	public String getEmpname() {
		return Empname;
	}
	
	public int getEmppin() {
		return Emppin;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public String getEmail() {
		return Email;
	}
	@Override
	public String toString() {
		return "EmployeeEx [Empname=" + Empname + ", Emppin=" + Emppin + ", Address=" + Address + ", Email=" + Email
				+ "]";
	}
	

}
