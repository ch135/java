package com.itcase.test;

public abstract class AbstractWayTest {
	public abstract void demo1();
	
	abstract void demo2();
	
	
	public AbstractWayTest(){
		System.out.println("抽象类的构造函数要给子类调用");
	}
	
	public AbstractWayTest(int a,int b){
		System.out.println(a+b);
	}
}