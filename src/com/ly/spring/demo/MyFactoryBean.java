package com.ly.spring.demo;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Cat> {

	@Override
	public Cat getObject() throws Exception {
		return new Cat("taiguo cat");
	}

	@Override
	public Class<?> getObjectType() {
		return Cat.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
