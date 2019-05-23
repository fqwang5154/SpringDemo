package com.ly.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// Calculator cal = new CalculatorImpl();
		// int result = cal.add(1, 2);
		// System.out.println(result);
		//
		// Calculator proxy=DynamicProxy.newInstance(cal);
		// int result = proxy.add(1, 2);
		// System.out.println(result);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
		Calculator cal = (Calculator) applicationContext.getBean("calculatorImpl");
		int res1 = cal.add(1, 2);
		System.out.println(res1);
		int res2 = cal.div(1, 0);
		System.out.println(res2);
	}
}
