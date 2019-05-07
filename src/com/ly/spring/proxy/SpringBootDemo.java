package com.ly.spring.proxy;

public class SpringBootDemo {
	public static void main(String[] args) {
		UserRepostory dao = new UserRepostory();
		// dao.save(new User("judy", 12));

		StaticAgent agent = new StaticAgent(dao);
		agent.save(new User("judy", 12));

		System.out.println(User.class.getName());
	}
}
