package com.ly.spring.annotation.testAnnotation;

public class SpringBootApplication {
	public static void main(String[] args) {
		try {
			Class<?> clazz=Class.forName("com.ly.spring.annotation.testAnnotation.User");
			Table table=(Table) clazz.getAnnotation(Table.class);
			String name=table.name();
			String value=table.value();
			System.out.println(name+"="+value);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
