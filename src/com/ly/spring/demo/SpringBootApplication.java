package com.ly.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBootApplication {

	public static void main(String[] args) {
//		HelloWorld hw=new HelloWorld();
//		hw.setName("judy");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloWorld hw=(HelloWorld)context.getBean("helloworld");
		
		hw.hello();
	}
}
