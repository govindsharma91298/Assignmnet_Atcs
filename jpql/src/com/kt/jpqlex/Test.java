package com.kt.jpqlex;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("postgres");
		
		EntityManager entity= factory.createEntityManager();
		
		
	entity.getTransaction().begin();
//		
//		EmployeeEx e= new EmployeeEx(100, "dIVYA", 10000, "KNL");
//	    EmployeeEx e1= new EmployeeEx(101, "TARUN", 12000, "KURNOOL");
//		EmployeeEx e2= new EmployeeEx(102, "SATHYA", 13000, "HYD");
//		EmployeeEx e3= new EmployeeEx(103, "MAHESH", 14000, "KMPL");
//		
//		
//		entity.persist(e);
//		entity.persist(e1);
//		entity.persist(e2);
//		entity.persist(e3);
//		
		
//		
//	
//	
//		TypedQuery<EmployeeEx> tq=entity.createQuery("select e from EmployeeEx e", EmployeeEx.class);
//	
//		List<EmployeeEx> li=tq.getResultList();
//		
//  for(EmployeeEx s:li) 
//    {
//	
//	System.out.println(s.getEmpId());
//	System.out.println(s.getEmpName());
//	System.out.println(s.getEmpSal());
//	
//  }
  
  Query result=entity.createQuery("update EmployeeEx set empSal= empSal+50000 where empSal>10000");
    result.executeUpdate();

		
    entity.getTransaction().commit();	
		

	}

}
