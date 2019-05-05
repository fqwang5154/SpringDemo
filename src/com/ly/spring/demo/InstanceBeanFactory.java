package com.ly.spring.demo;

import java.util.HashMap;
import java.util.Map;

public class InstanceBeanFactory {
	
	public Cat getCat(String name){
		return new Cat(name);
	}
}
