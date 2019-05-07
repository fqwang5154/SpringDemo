package com.ly.spring.工厂方法模式.替代单例模式;

public class BootDemo {
	public static void main(String[] args) {
		Product p = ProductFactory.getProductInstance();
		p.setType(2);
		System.out.println(p.getType());
	}
}
