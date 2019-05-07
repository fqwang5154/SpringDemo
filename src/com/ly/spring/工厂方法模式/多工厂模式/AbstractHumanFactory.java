package com.ly.spring.工厂方法模式.多工厂模式;

import com.ly.spring.工厂方法模式.Human;

public abstract class AbstractHumanFactory {

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

	public abstract Human createHuman();
}
