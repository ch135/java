package com.itcase.test;

/**
 * 
 * @author chenhao
 *
 */
public abstract class AbstractWayTest {
	/**
	 * 抽象接口测试类
	 */
	public abstract void demo1();
	/**
	 * 抽象接口测试类
	 */
	abstract void demo2();
	
	
	public AbstractWayTest(){
		System.out.println("抽象类的构造函数要给子类调用");
	}
	
	public AbstractWayTest(int a,int b){
		System.out.println(a+b);
	}
}