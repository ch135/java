package com.itcase.test;

public interface InterfaceWayTest {
	//接口成员变量必须是静态变量
	public int a=9;
	//方法只能是抽象实例方法，类方法，
	public abstract void text();
	//默认方法
	default void print(){
		System.out.println(a);
	}
}
