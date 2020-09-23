package com.study.design.patters.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TimeInvocationHandler implements InvocationHandler {

	private Object object;
	
	private TimeInvocationHandler(Object object) {
		this.object = object;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// args 就是原方法参数
		long startTime = System.currentTimeMillis();
		Object obj = method.invoke(object, args);
		long endTime = System.currentTimeMillis();
		// method.getDeclaringClass().getName() 获取被代理类全限定名
		System.out.println(method.getDeclaringClass().getName() + " " 
				+ method.getName() + " "
				+ "耗时：" + (endTime - startTime));
		return obj;
	}
	
	/**
	 * 获取代理对象
	 * @param obj
	 * @return
	 */
	public static Object newProxyInstance(Object obj) {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class<?>[] interfaces = obj.getClass().getInterfaces();
		TimeInvocationHandler h = new TimeInvocationHandler(obj);
		Object proxy = Proxy.newProxyInstance(loader, interfaces, h);
		return proxy;
	}

	
}
