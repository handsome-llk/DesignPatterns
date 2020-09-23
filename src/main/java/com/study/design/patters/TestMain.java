package com.study.design.patters;

import java.lang.reflect.InvocationTargetException;

import com.study.design.patters.proxy.ProxyMain;

public class TestMain {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		ProxyMain.proxyMain();
	}
	
}
