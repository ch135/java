package com.itcase.test;

/**
 * @author chenhao
 * <p>一个完整类包含:成员变量、构造器、方法；
 * 没有定义构造函数时，系统会默认提供一个构造器</p>
 */ 
public class AbstractBaseTest {
	private String name;
	private String age;
	
	 /**代码块，在实例化函数时执行*/
	{ name="陈浩"; age="22"; }
	
	 /**
	  * 构造器
	  * @param name 用户名
	  * @param age 年龄
	  */
	public AbstractBaseTest(String name, String age) {
		this.name = name;
		this.age = age;
	}

	public static void say() {
		// new调用构造器时返回该类的实例；应为构造器的返回值是隐藏的，所以不能规定返回类型
		// 创建了对象(Demo1)--数据放在堆中 和 变量(d1)--放在栈中
		AbstractBaseTest d1 = new AbstractBaseTest("xx", "22");
		System.out.println("姓名:" + d1.name + "年齡:" + d1.age);
	}
	
	/**两个text构成方法的重载*/
	public static void text() {}
	public static void text(String s) {}
}