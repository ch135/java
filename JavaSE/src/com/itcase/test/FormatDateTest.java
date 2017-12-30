package com.itcase.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatDateTest{
	public static void main(String[] args){
		System.out.println(DateFormat.SHORT);
		System.out.println(DateFormat.MEDIUM);
		System.out.println(DateFormat.LONG);
		System.out.println(DateFormat.FULL);
		
		Date das=new Date();
		DateFormat da=DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.CHINA);
		//DateFormat对象将date对象转化为String对象
		String time=da.format(das);
		System.out.println(time);
		
		Date das1=new Date();
		DateFormat da1=DateFormat.getDateTimeInstance(DateFormat.FULL,0,Locale.CHINA);
		String time1=da1.format(das1);
		System.out.println(time1);
		
		//SimpleDateFormat:DateFormat的子类，更容易规定日期格式
		Date sda=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 本年第DD天，本月dd号 时间HH:mm:ss 第k时");
		//format()：将Date转化为String
		String sd=sdf.format(sda);
		System.out.println(sd);
		
		//将SimpleDateFormat对象转化为Date
		SimpleDateFormat sdf1=new SimpleDateFormat("YYYY-MM-dd");
		System.out.println(sdf1);
		try {
			//parse()：将String转化为Date
			Date sd_d=sdf1.parse("2010-12-31");
			System.out.println(sd_d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}