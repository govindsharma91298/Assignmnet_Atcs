package caseStudy3Ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import caseStudy3.Product;

public class Employeeclient {

	public static void main(String[] args) {
		int eid=100;
		HashMap<Integer,EmployeeEx> h1=new HashMap<Integer,EmployeeEx>();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Add Employee Detail");
			System.out.println("2. Update Employee Detail");
			System.out.println("3. Delete Employee Detail");
			System.out.println("4. Get Employee Detail");
			System.out.println("5. Get All Employee Deatil");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1 :
				System.out.println("Enter Employee name: ");
				  String empname=sc.next();
   				System.out.println("Enter Employee pin: ");  
   				  int emppin=sc.nextInt();
   				 System.out.println("Enter Employee Address: ");
   				   String address=sc.next();
   				 System.out.println("Enter Employee Email: ");
   				  String Email=sc.next();
   				  
   				  EmployeeEx emp=new EmployeeEx(empname,emppin,address,Email);
   				  
   				  h1.put(++eid, emp);
   				  
   				  System.out.println("Employee added Successfully "+eid );
				  
				
				
				
				break;
				
			case 2:
				System.out.println("Enter id of Employee to update details: ");
				int eid1=sc.nextInt();
				System.out.println("Enter Employee name: ");
				  String empname1=sc.next();
 				System.out.println("Enter Employee pin: ");  
 				  int emppin1=sc.nextInt();
 				 System.out.println("Enter Employee Address: ");
 				   String address1=sc.next();
 				 System.out.println("Enter Employee Email: ");
 				  String Email1=sc.next();
				
 				  EmployeeEx emp1=new EmployeeEx(empname1,emppin1,address1,Email1);
 				  
 				  h1.put(eid1,emp1);
 				  
 				  
 				  System.out.println("Employee details update successfully");
				
				break;
				
			case 3:
				System.out.println("Enter Employee id to delete its details: ");
				int eid2=sc.nextInt();
				
				System.out.println(h1.remove(eid2));
				
				break;
				
			case 4:
				System.out.println("Enter Employee id to get its details: ");
				int eid3=sc.nextInt();
				System.out.println(h1.get(eid3));
				
				break;
				
			case 5:
				Set<Entry<Integer,EmployeeEx>> result=h1.entrySet();
		    	   Iterator<Entry<Integer,EmployeeEx>> itr=result.iterator();
		    	   
		    	   while(itr.hasNext()) {
		    		   Entry<Integer,EmployeeEx> finalResult=itr.next();
		    		   
		    		   System.out.println(finalResult.getKey()+"  "+finalResult.getValue());
		    		   
		    	   }
				
				break;
				
			}
		}

	}

}
