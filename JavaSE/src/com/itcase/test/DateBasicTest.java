package com.itcase.test;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author scholarly
 *
 */

public class DateBasicTest{
	public static void main(String[] args){
		//Date类几乎被淘汰，好多方法都用不了
		Date da=new Date();
		System.out.println(da);
		System.out.println(da.toString());
		System.out.println(da.getTime());
		System.out.println(da.toInstant());
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.getCalendarType());
		String[] str=cal.toString().split(",");
		for(String st:str){
			System.out.println(st);
		}
		//以毫秒形式表示但钱时间
		long time=cal.getTimeInMillis();
		System.out.println(time);
		
		//Calendar转化为date
		Calendar cal1=Calendar.getInstance();
		@SuppressWarnings("unused")
		Date cda=cal1.getTime();
		
		//date转化为calendar
		Date das=new Date();
		Calendar cal2=Calendar.getInstance();
		cal2.setTime(das);
	}
}