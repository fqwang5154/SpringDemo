package com.ly.spring.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBootApplication {

	public static void main(String[] args) {
		// HelloWorld hw=new HelloWorld();
		// hw.setName("judy");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//		User user4 = (User) context.getBean("user4");
//
//		System.out.println(user4);
//
//		User user7 = (User) context.getBean("user7");
//
//		System.out.println(user7);
		
		
//		ConnectionFactory conn = (ConnectionFactory) context.getBean("connectionFactory");
//		
//		System.out.println(conn);
		
//		Cat cat = (Cat) context.getBean("kitty");
//		Cat cat = (Cat) context.getBean("black");
//		Cat cat1 = (Cat) context.getBean("tcat");
//		Cat cat2 = (Cat) context.getBean("tcat");
//
//		System.out.println(cat1==cat2);
		
		User user =new User();
		Class<?> clazz=user.getClass();
//		Field[] fields=clazz.getDeclaredFields();
//		for(Field field: fields){
//			System.out.println(field.getModifiers());
////			System.out.println(field.getType());
////			System.out.println(field.getName());
//		}
//		
//		try {
//			Object obj=clazz.newInstance();
//			Field field=clazz.getDeclaredField("age");
//			System.out.println(field.isAccessible());
//			field.setAccessible(true);
//			field.set(obj, 12);
//			System.out.println(field.get(obj));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		Method[] methods=clazz.getMethods();
//		System.out.println(methods.length);
//		for(Method m: methods){
//			System.out.println(m.getName());
//		}
		
//		try {
//			Method m=clazz.getDeclaredMethod("hello", String.class);
//			m.invoke(user,new String[]{ "judy"});
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		List<String> list1=new ArrayList<String>();
//		
//		List<Integer> list2=new ArrayList<Integer>();
//		
//		System.out.println(list1.getClass());
//		System.out.println(list2.getClass());
//		
//		System.out.println(list1.getClass()==list2.getClass());
//		MyList<String> list1=new MyList<String>();
//		list1.add("judy");
//		list1.add("jack");
//		
//		System.out.println(list1.get(0));
//		
		MyList<Integer> list2=new MyList<Integer>();
		list2.add(100);
		list2.add(200);
//		
//		System.out.println(list2.get(0));
		add("judy");
		add(1);
	}
	
	public static <T, E> E add(T v){
		//...
		return (E)v;
	}
}

class MyList<T>{
	Object[] obj=new Object[10];
	int index=0;
	public void add(T t){
		obj[index++]=t;
	}
	public T get(int i){
		return (T)obj[i];
	}
}
