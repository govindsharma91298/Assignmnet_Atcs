package com.ia.employeecrud;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Test {

	
	public static void main(String[] args) {
EntityManagerFactory factory=Persistence.createEntityManagerFactory("postgres");
		
		EntityManager entity=factory.createEntityManager(); 
		
		
		Employee emp= new Employee(123, "govind", 1000, "jaip");
		
		entity.getTransaction().begin();
		
		
	//	Employee emp=entity.find(Employee.class, 123);
				//System.out.println(emp); 
				
			emp.setEmpAdd("maharastra");
			emp.setEmpname("ragu");
				emp.setEmpsal(780000);
				
				entity.merge(emp);
				//entity.remove(emp);
				
	
		
		
		entity.getTransaction().commit();
		
	}
}

