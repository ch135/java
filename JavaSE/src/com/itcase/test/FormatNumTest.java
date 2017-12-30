package com.itcase.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormatNumTest {
	public static void main(String[] args){
		double mynum1 = 230456789;
		double mynum2 = 0.23;
		String str="100.097879";
		//获取常规数值格式
		NumberFormat nf1 = NumberFormat.getInstance(Locale.CHINA);
		//获取货币数值格式。
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.US);
		//获取显示百分比的格式
		NumberFormat nf4 = NumberFormat.getPercentInstance();

		System.out.println(nf1.format(mynum1));
		System.out.println(nf2.format(mynum1));
		System.out.println(nf3.format(mynum1));
		System.out.println(nf4.format(mynum2));
		
		//String转化为Number对象
		NumberFormat num=NumberFormat.getNumberInstance(Locale.CHINA);
		try {
			Number st=num.parse(str);
			System.out.println(st);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
