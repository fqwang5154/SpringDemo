package com.ly.spring.工厂方法模式.简单工厂模式;

import com.ly.spring.工厂方法模式.BlackHuman;
import com.ly.spring.工厂方法模式.WhiteHuman;
import com.ly.spring.工厂方法模式.YellowHuman;

public class BootDemo {
	public static void main(String[] args) {
		WhiteHuman wh = HumanFactory.createHuman(WhiteHuman.class);
		wh.color();
		wh.talk();
		BlackHuman bh = HumanFactory.createHuman(BlackHuman.class);
		bh.color();
		bh.talk();
		YellowHuman yh = HumanFactory.createHuman(YellowHuman.class);
		yh.color();
		yh.talk();
	}
}
