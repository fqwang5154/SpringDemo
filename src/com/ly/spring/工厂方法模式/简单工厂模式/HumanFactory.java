package com.ly.spring.工厂方法模式.简单工厂模式;

import com.ly.spring.工厂方法模式.Human;

public class HumanFactory {
	@SuppressWarnings("unchecked")
	public static <T extends Human> T createHuman(Class<T> t) {
		T human = null;
		try {
			human = (T) Class.forName(t.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return human;
	}
}
