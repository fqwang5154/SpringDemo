package com.ly.spring.工厂方法模式;

public class HumanFactory extends AbstractHumanFactory {
	@SuppressWarnings("unchecked")
	@Override
	public <T extends Human> T createHuman(Class<T> t) {
		T human = null;
		try {
			human = (T) Class.forName(t.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return human;
	}
}
