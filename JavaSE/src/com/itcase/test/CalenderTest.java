package com.itcase.test;

import java.util.Calendar;
//calendar：处理实间的函数，解决了Date无法实现国际化，月数和日数开始计时的问题
public class CalenderTest {
	public static void main(String[] args){
		//Calendar是抽象类，不呢使用构造方法来获取实例
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getTime());
		cal.set(2010,13,21,13,29,10);
		System.out.println(cal.getTime());
	}
}
