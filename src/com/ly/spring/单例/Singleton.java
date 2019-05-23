package com.ly.spring.单例;

public class Singleton {

	private Singleton() {
	}

	public Singleton getInstance() {
		return SSingletonHandler.s;
	}

	private static class SSingletonHandler {
		private static final Singleton s = new Singleton();
	}

}
