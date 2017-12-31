package com.itcase.test;


public class InterfaceDemoTest implements InterfaceWayTest{
	
	/* 调用接口的方法、变量 */
	public void getMessage(InterfaceDemoTest in){
		in.Text();
		System.out.println(InterfaceWayTest.a);
		in.Print();
	}
	
	/* 实现接口的抽象方法 */
	public void Text(){
		System.out.println( "接口只能继承借口，方法要用implements调用接口" );
		System.out.println( "被调用的接口必须要实现，没用实现时调用他的类必须是抽象类，接口没有构造器" );
	}
}
