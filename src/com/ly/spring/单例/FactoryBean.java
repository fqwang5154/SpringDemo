package com.ly.spring.单例;

public class FactoryBean {

	private volatile static FactoryBean fb = null;

	private FactoryBean() {
	}

	static {
		fb = new FactoryBean();
	}

	public static FactoryBean newInstatnce() {
		// System.out.println("newInstatnce-3");
		// if (fb == null) {
		// synchronized (FactoryBean.class) {
		// if (fb == null) {
		// fb = new FactoryBean();
		// // 给DoubleCheckSingleton类的实例instance分配内存
		// // 调用实例instance的构造函数来初始化成员变量
		// // 将instance指向分配的内存地址
		// }
		// }
		// }
		return fb;
	}

	public void test() {
		System.out.println("test....");
	}
}

// enum FactoryBean {
// INSTANCE;
// // 静态属性和方法
// static int value;
//
// public static int getValue() {
// return value;
// }
//
// // 实例属性和方法
// String type = "INSTANCE";
//
// public String getType() {
// return type;
// }
//
// public void test() {
// System.out.println("test...");
// }
// }
