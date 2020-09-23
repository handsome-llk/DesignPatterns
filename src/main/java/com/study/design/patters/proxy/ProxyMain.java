package com.study.design.patters.proxy;

import java.lang.reflect.InvocationTargetException;

public class ProxyMain {

	/**
	 * 动态代理
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 */
	public static void proxyMain() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		ProxyAnimalInterface cat = (ProxyAnimalInterface) TimeInvocationHandler.newProxyInstance(new ProxyCat());
		System.out.println(cat.eat(9));
		cat.sleep();
	}
	
}
