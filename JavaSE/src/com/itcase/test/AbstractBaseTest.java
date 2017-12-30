package com.itcase.test;

/*
 * <p>一个完整类包含:成员变量、构造器、方法；没有定义构造函数时，系统会默认提供一个构造器</p>
 */
public class AbstractBaseTest {
	 // 成员变量
	private String n;
	private String a;
	
	 //代码块，在实例化函数时执行
	{ n="陈浩"; a="22"; }
	
	 // 构造器
	public AbstractBaseTest(String name, String age) {
		this.n = name;
		this.a = age;
	}

	// 方法
	public static void say() {
		// new调用构造器时返回该类的实例；应为构造器的返回值是隐藏的，所以不能规定返回类型
		// 创建了对象(Demo1)--数据放在堆中 和 变量(d1)--放在栈中
		AbstractBaseTest d1 = new AbstractBaseTest("xx", "22");
		System.out.println("姓名:" + d1.n + "年齡:" + d1.a);
	}

	// 形参个数随机变化
	public static void random(String... Books) {
		for (String s : Books) {
			System.out.println(s);
		}
	}
	//两个text构成方法的重载
	public static void text() {

	}
	public static void text(String s) {

	}
}