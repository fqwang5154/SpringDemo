package com.ly.spring.工厂方法模式;

public class BlackHuman implements Human {
	@Override
	public void color() {
		System.out.println("我是黑人");
	}

	@Override
	public void talk() {
		System.out.println("我说英语");
	}
}
