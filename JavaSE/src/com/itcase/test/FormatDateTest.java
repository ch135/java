package com.itcase.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/*
 * @author chenhao
 * @date 2017/12/31 
 * SimpleDateFormat<br/>
 * 		--format() : Date-->Sting<br/>
 * 		--parse() : String-->Date
 */
public class FormatDateTest{
	public static void main(String[] args){
		
		//DateFormat:Date-->String
		Date das=new Date();
		DateFormat da=DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.CHINA);
		String time=da.format(das);
		System.out.println(time);
		
		Date das1=new Date();
		DateFormat da1=DateFormat.getDateTimeInstance(DateFormat.FULL,0,Locale.CHINA);
		String time1=da1.format(das1);
		System.out.println(time1);
		
		//SimpleDateFormat:DateFormat的子类，更容易规定日期格式
		Date sda=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 本年第DD天，本月dd号 时间HH:mm:ss 第k时");
		String sd=sdf.format(sda);
		System.out.println(sd);
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1);
		try {
			Date sd_d=sdf1.parse("2010-12-31");
			System.out.println(sd_d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}