package com.study.design.patters.proxy;

public class ProxyCat implements ProxyAnimalInterface {

	private static final int canEat = 10;
	
	@Override
	public boolean eat(int num) {
		System.out.println("小猫最多吃10条鱼");
		return canEat >= num;
	}

	@Override
	public void sleep() {
		System.out.println("小猫睡觉");
	}

}
