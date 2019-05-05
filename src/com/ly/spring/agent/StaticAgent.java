package com.ly.spring.agent;

public class StaticAgent {
	
	private BaseRepository repository;

	public StaticAgent(BaseRepository repository) {
		this.repository = repository;
	}
	
	public int doSave(User user){
		System.out.println("==============获取数据连接==============");
		
		int result=repository.save(user);
		
		System.out.println("==============提交事务==============");
		
		System.out.println("==============关闭连接==============");
		
		return result;
	}

}
