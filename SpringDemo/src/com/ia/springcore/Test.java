package com.ia.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	public static void main(String[] args) {
//		Resource resource=new ClassPathResource("springConfig.xml");
//		
//		BeanFactory factory=new XmlBeanFactory(resource);
//		
		ApplicationContext factory = new ClassPathXmlApplicationContext("springConfig.xml");
		Employee emp =(Employee) factory.getBean("sleeping");
		
	System.out.println(emp);
//		emp.display();
//		
	}

}
