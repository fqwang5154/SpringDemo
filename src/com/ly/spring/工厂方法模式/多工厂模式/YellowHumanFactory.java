package com.ly.spring.工厂方法模式.多工厂模式;

import com.ly.spring.工厂方法模式.Human;
import com.ly.spring.工厂方法模式.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory {
	@Override
	public Human createHuman() {
		return new YellowHuman();
	}
}
