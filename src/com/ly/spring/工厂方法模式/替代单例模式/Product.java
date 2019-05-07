package com.ly.spring.工厂方法模式.替代单例模式;

public class Product {
	// 产品类型
	private int type;

	// 构造器私有化
	private Product() {

	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
