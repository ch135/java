package com.itcase.test;

public class BaseTypeTest {
	// 基本数据类型数据对象转化成基本数据类型；
	public Integer change() {
		Integer a = new Integer(12132);
		int c = Integer.valueOf(a);
		return c;
	}

	public void theory() {
		Integer a = 4;// 等同于Integer a=new Integer(4);
						// jdk5后自动进行封箱
		a = a + 4;// 对象+基本数据原理
					// a先进行拆箱，转化成基本数据类型，后又封箱，转化成对象
					// 真实为：a=a.valueof()+4
		Integer b = 128;
		Integer c = 128;
		Integer d = 127;
		Integer e = 127;
		System.out.println(b == c);// 输出false
		System.out.println(d == e);// 输出true
		/*
		 * 当数据超过数据类型范围时，会创建不同的数据对象
		 * 当数据没超过数据类型范围时，会指向同一数据对象
		 */
	}
}
