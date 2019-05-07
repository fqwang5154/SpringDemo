package com.ly.spring.工厂方法模式.多工厂模式;

import com.ly.spring.工厂方法模式.BlackHuman;
import com.ly.spring.工厂方法模式.Human;

public class BlackHumanFactory extends AbstractHumanFactory {
	@Override
	public Human createHuman() {
		return new BlackHuman();
	}
}
