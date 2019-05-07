package com.ly.spring.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {

	@SuppressWarnings("unchecked")
	public <T> T doSave(final T t) {
		return (T) Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(),
				new InvocationHandler() {

					/**
					 * InvocationHandler的实例 proxy 代理类 method 目标方法 args 参数
					 */
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("==============获取数据连接==============");

						Object result = method.invoke(t, args);

						System.out.println("==============提交事务==============");

						System.out.println("==============关闭连接==============");

						return result;
					}
				});
	}

}
