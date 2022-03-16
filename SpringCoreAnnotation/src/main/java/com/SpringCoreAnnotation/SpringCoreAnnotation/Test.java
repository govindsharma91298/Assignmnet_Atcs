package com.SpringCoreAnnotation.SpringCoreAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.SpringCoreAnnotation.SpringCoreAnnotation")
public class Test {

	public static void main(String[] args) {
		//ApplicationContext factory= new ClassPathXmlApplicationContext("springConfigure.xml");
		ApplicationContext factory= new AnnotationConfigApplicationContext(Test.class);
		
		
		
		Pizza p =(Pizza) factory.getBean("pizza");
		p.setPizzano(100);
		p.setPrice(450);
		
		Address add=(Address) factory.getBean("address");
		add.setHno(302);
		add.setColony("sanskar vihar");
		add.setCity("jaipur");
		
		
		System.out.println(p);
		Pizza p1=(Pizza) factory.getBean("pizza");
		System.out.println(p1);
		Pizza p2=(Pizza) factory.getBean("pizza");
		System.out.println(p2);
	}

}
