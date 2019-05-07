package com.ly.spring.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SpringBootDemo {
	public static void main(String[] args) {
		UserRepostory dao = new UserRepostory();
		// dao.save(new User("judy", 12));

		DynamicProxy proxy = new DynamicProxy();
		BaseRepository repository = proxy.doSave(dao);
		System.out.println(repository.getClass().getName());
		repository.save(new User("judy", 12));

	}
}

class Proxy0 implements BaseRepository {

	InvocationHandler h = null;

	Proxy0(InvocationHandler h) {
		this.h = h;
	}

	@Override
	public int save(User user) {
		Object result = null;
		try {
			Method method = this.getClass().getDeclaredMethod("sava", user.getClass());
			result = this.h.invoke(this, method, new Object[] { user });
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return (int) result;
	}
}