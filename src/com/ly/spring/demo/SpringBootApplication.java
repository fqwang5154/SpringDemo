package com.ly.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBootApplication {

	public static void main(String[] args) {
		// HelloWorld hw=new HelloWorld();
		// hw.setName("judy");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//		User user4 = (User) context.getBean("user4");
//
//		System.out.println(user4);
//
//		User user7 = (User) context.getBean("user7");
//
//		System.out.println(user7);
		
		
		ConnectionFactory conn = (ConnectionFactory) context.getBean("connectionFactory");
		
		System.out.println(conn);
	}
}
