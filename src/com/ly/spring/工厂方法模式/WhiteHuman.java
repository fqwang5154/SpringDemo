package com.ly.spring.工厂方法模式;

public class WhiteHuman implements Human {

	@Override
	public void color() {
		System.out.println("我是白人");
	}

	@Override
	public void talk() {
		System.out.println("我说美语");
	}

}
