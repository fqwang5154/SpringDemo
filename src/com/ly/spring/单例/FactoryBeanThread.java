package com.ly.spring.单例;

public class FactoryBeanThread extends Thread {
	@Override
	public void run() {
		FactoryBean fb = FactoryBean.newInstatnce();
		fb.test();
	}
}
