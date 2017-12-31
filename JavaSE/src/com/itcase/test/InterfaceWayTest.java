package com.itcase.test;

public interface InterfaceWayTest {
	
	public int a=9;
	
	/*方法只能是抽象实例方法，类方法 */
	public abstract void Text();
	
	/* 默认方法 */
	default void Print(){
		System.out.println(a);
	}
}
