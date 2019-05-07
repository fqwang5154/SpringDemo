package com.ly.spring.单例;

public class FactoryBeanBoot {
	public static void main(String[] args) {
		FactoryBean fb0 = FactoryBean.INSTANCE;
		FactoryBean fb1 = FactoryBean.INSTANCE;
		System.out.println(fb0 == fb1);
		fb0.test();
		fb1.test();
		System.out.println(fb0.getType());
		System.out.println(fb1.getType());

		// for (int i = 0; i < 100; i++) {
		// FactoryBeanThread th = new FactoryBeanThread();
		// th.start();
		// }
	}
}
