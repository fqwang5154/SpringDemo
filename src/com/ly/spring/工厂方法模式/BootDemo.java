package com.ly.spring.工厂方法模式;

public class BootDemo {
	public static void main(String[] args) {
		AbstractHumanFactory factory = new HumanFactory();
		WhiteHuman wh = factory.createHuman(WhiteHuman.class);
		wh.color();
		wh.talk();
		BlackHuman bh = factory.createHuman(BlackHuman.class);
		bh.color();
		bh.talk();
		YellowHuman yh = factory.createHuman(YellowHuman.class);
		yh.color();
		yh.talk();
	}
}
