package com.ly.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class DynamicProxy {


	@SuppressWarnings("unchecked")
	public static <T> T newInstance(final T t) {

		return (T) Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println(method.getName() + ": " + Arrays.asList(args));
				Object result = method.invoke(t, args);
				return result;
			}
		});
	}
}
