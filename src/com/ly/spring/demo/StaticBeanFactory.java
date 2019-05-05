package com.ly.spring.demo;

import java.util.HashMap;
import java.util.Map;

public class StaticBeanFactory {
	public static Cat getCat(String name){
		return new Cat(name);
	}
}
