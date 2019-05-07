package com.ly.spring.proxy2;

public class UserRepostory implements BaseRepository{
	
	@Override
	public int save(User user){
//		System.out.println("==============获取数据连接==============");
		
		System.out.println("==============数据持久化==============");
		
//		System.out.println("==============提交事务==============");
		
//		System.out.println("==============关闭连接==============");
		return 1;
	}
}
