package com.ly.spring.工厂方法模式;

public class YellowHuman implements Human {
	@Override
	public void color() {
		System.out.println("我是黄人");
	}

	@Override
	public void talk() {
		System.out.println("我说汉语");
	}
}
