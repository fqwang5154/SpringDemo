package com.ly.spring.工厂方法模式.替代单例模式;

import java.lang.reflect.Constructor;

public class ProductFactory {
	private static Product p;
	static {
		try {
			Class<?> cl = Class.forName(Product.class.getName());
			Constructor<?> constructor = cl.getDeclaredConstructor();
			constructor.setAccessible(true);
			p = (Product) constructor.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Product getProductInstance() {
		return p;
	}
}
