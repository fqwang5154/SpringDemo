package com.ly.spring.agent;

public class SpringBootDemo {
	public static void main(String[] args) {
		UserRepostory dao=new UserRepostory();
//		dao.save(new User("judy", 12));
		
		StaticAgent agent=new StaticAgent(dao);
		agent.doSave(new User("judy", 12));
	}
}
