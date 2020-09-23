package com.study.design.patters.proxy;

public interface ProxyAnimalInterface {

	/**
	 * 给num个物品，返回吃完了吗
	 * @param num
	 * @return
	 */
	public boolean eat(int num);
	
	public void sleep();
	
}
