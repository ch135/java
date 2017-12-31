package com.itcase.test;

import java.util.Calendar;
/*
 * @author chenhao
 * @date 2017/12/31
 * <p>calendar：处理时间的函数，解决了Date无法实现国际化，月数和日数开始计时的问题</p>
 * <p>Calendar是抽象类，不呢使用构造方法来获取实例</p>
 */
public class CalenderTest {
	
	public static void main(String[] args){
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getTime());
		cal.set(2010,13,21,13,29,10);
		System.out.println(cal.getTime());
	}
	
}
