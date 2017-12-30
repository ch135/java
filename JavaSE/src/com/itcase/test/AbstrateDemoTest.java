package com.itcase.test;

public class AbstrateDemoTest extends AbstractWayTest {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		AbstrateDemoTest ab = new AbstrateDemoTest();
		AbstrateDemoTest ab2 = new AbstrateDemoTest(1,3);
		ab2.demo1();
		ab2.demo2();
	}
	
	//使用super调用父类构造函数（也可用super调用夫类的变量和方法）
	public AbstrateDemoTest(){
		super();
	}
	
	public AbstrateDemoTest(int x,int y){
		super(x,y);
	}
	
	public void demo1() {
		System.out.println("抽像类方法不能被实例，没有方法体");
	}
	
	public void demo2(){
		System.out.println("抽象类的作用就是一种模版模式的设计");
	}
}