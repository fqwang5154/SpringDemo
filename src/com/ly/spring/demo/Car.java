package com.ly.spring.demo;

public class Car {

	public Car() {
		System.out.println("instance bean");
	}

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		System.out.println("setter bean");
		this.type = type;
	}

	public void init() {
		System.out.println("init bean");
	}

	public void destory() {
		System.out.println("destory bean");
	}
}
