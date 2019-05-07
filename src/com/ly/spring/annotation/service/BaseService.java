package com.ly.spring.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ly.spring.annotation.repository.BaseRepository;

public class BaseService<T> {

	@Autowired
	public BaseRepository<T> repository;
	
	public void add(){
		System.out.println("service add...");
		System.out.println(repository);
	}
}
