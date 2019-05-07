package com.ly.spring.工厂方法模式.多工厂模式;

import com.ly.spring.工厂方法模式.Human;

public class BootDemo {
	public static void main(String[] args) {
		// AbstractHumanFactory yellowHumanFactory = new YellowHumanFactory();
		// Human wh = yellowHumanFactory.createHuman();
		// wh.color();
		// wh.talk();
		//
		// AbstractHumanFactory blackHumanFactory = new BlackHumanFactory();
		// Human bh = blackHumanFactory.createHuman();
		// bh.color();
		// bh.talk();
		//
		// AbstractHumanFactory whiteHumanFactory = new WhiteHumanFactory();
		// Human yh = whiteHumanFactory.createHuman();
		// yh.color();
		// yh.talk();

		Human wh = AbstractHumanFactory.newInstance(YellowHumanFactory.class).createHuman();
		wh.color();
		wh.talk();

		Human bh = AbstractHumanFactory.newInstance(BlackHumanFactory.class).createHuman();
		bh.color();
		bh.talk();

		Human yh = AbstractHumanFactory.newInstance(WhiteHumanFactory.class).createHuman();
		yh.color();
		yh.talk();
	}
}

class HumanFactoryAdapter {
	@SuppressWarnings("unchecked")
	public static <T extends AbstractHumanFactory> T newInstance(Class<T> cl) {
		T factory = null;
		try {
			factory = (T) Class.forName(cl.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return factory;
	}
}