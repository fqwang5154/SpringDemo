package com.ly.spring.demo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {

	private String name;

	private int age;

	private List<String> list;

	private Set<String> set;

	private Map<String, Integer> map;

	private Properties props;
	
	private Cat cat;

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public List<String> getList() {
		return list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void hello() {
		System.out.println("hello, " + this.name);
	}

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", list=" + list + ", set=" + set + ", map=" + map + ", props="
				+ props + ", cat=" + cat + "]";
	}


}
