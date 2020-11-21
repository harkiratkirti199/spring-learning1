package io.pragra.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.pragra.learning.config.AppConfig;

@SpringBootApplication
public class App {
	public static void main(String args[]) {
		
//		ApplicationContext context=
//				new ClassPathXmlApplicationContext("beans.xml");
//		HomeAddress home=context.getBean(HomeAddress.class);
//		System.out.println(home);
//		Person person=context.getBean(Person.class);
//		System.out.println(person);
//		OfficeAddress address=context.getBean(OfficeAddress.class);
//		System.out.println(address);
		
//		ApplicationContext context1=
//				new AnnotationConfigApplicationContext("io.pragra.learning.config");
//		HomeAddress home=context1.getBean("homeaddress",HomeAddress.class);
//		System.out.println(home);
//		HomeAddress home2=context1.getBean("homeaddress2",HomeAddress.class);
//		System.out.println(home2);
//		OfficeAddress office=context1.getBean(OfficeAddress.class);
//		System.out.println(office);
		
		ApplicationContext context2=SpringApplication.run(App.class, args);
		HomeAddress home2=context2.getBean("homeaddress",HomeAddress.class);
		System.out.println(home2);
		
		
		((AbstractApplicationContext) context2).close();
		
	
	}

}
