package com.itcase.test;


public class InterfaceDemoTest implements InterfaceWayTest{
	public static void main(String[] args){
		InterfaceDemoTest in=new InterfaceDemoTest();
		in.text();
		//调用接口的成员变量
		System.out.print(InterfaceWayTest.a);
		//调用接口的默认方法
		in.print();
	}
	//实现接口的抽象方法
	public void text(){
		System.out.println("接口只能继承借口，方法要用implements调用接口");
		System.out.println("被调用的接口必须要实现，没用实现时调用他的类必须是抽象类，接口没有构造器");
	}
}
