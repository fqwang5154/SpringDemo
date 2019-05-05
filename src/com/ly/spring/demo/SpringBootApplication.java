package com.ly.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBootApplication {

	public static void main(String[] args) {
		// HelloWorld hw=new HelloWorld();
		// hw.setName("judy");

		// User user4 = (User) context.getBean("user4");
		//
		// System.out.println(user4);
		//
		// User user6 = (User) context.getBean("user6");
		//
		// System.out.println(user6);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car = (Car) context.getBean("car");
		System.out.println(car.getType());
		context.close();
	}
}
