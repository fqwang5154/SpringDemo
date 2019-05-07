package com.ly.spring.proxy;

public class StaticAgent implements BaseRepository {

	private BaseRepository repository;

	public StaticAgent(BaseRepository repository) {
		this.repository = repository;
	}

	public int save(User user) {
		System.out.println("==============获取数据连接==============");

		int result = repository.save(user);

		System.out.println("==============提交事务==============");

		System.out.println("==============关闭连接==============");

		return result;
	}

}
