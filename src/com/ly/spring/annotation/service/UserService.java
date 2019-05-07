package com.ly.spring.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ly.spring.annotation.repository.BaseRepository;
import com.ly.spring.annotation.vo.User;

@Service
public class UserService extends BaseService<User>{
	
//	@Autowired
//	private UserRepository userRepository;
	
	@Autowired
	public BaseRepository<User> repository;
	
}
