package com.itcase.test;

import java.io.UnsupportedEncodingException;

public class StringTest {
	public static String str = "vcwcv";

	// 转化为大写
	public String toup(String str) {
		return str.toUpperCase();
	}

	// 转化为小写
	public String toLow(String str) {
		return str.toLowerCase();
	}

	// 去除字符串首位端空格
	public String del_break(String str) {
		return str.trim();
	}

	// 切分字符串
	/*
	 * split()原理：当标记字符串在自符串开头时，字符串被切成两个字符串（一个是空字符） 在末尾时，没有多余字符串生成
	 */
	public String cut(String str) {
		String[] strs = str.split(" ");
		@SuppressWarnings("unused")
		String ss = str.substring(0, 9);
		str = "";
		for (String st : strs) {
			str += st;
		}
		return str;
	}

	// 查找某个字符串的位置
	public Integer find(String str) {
		return str.indexOf("vco", 12);
	}

	// 字符创转化为数组
	public char[] Str_To_char(String str) {
		char[] ch = str.toCharArray();
		return ch;
	}

	// 字符串转化为字节数组
	public byte[] Str_To_byte(String str) {
		byte[] ch = str.getBytes();
		return ch;
	}

	// 字符串转化为基本数据类型
	public int chnage(String str) {
		int bs = Integer.parseInt(str);
		return bs;
	}

	// 基本数据类型转化为字符串
	public String XX_To_String(int a) {
		return String.valueOf(a);
	}

	/*
	 * StringBuffer:单线程，了解就好，不适用 特点：（1）可插入不同类型的数据 （2）容器默认容量为16字节，超过时自动扩容
	 */
	// 对子字符串进行增删改查
	public String Link_String(String str1, String str2) {
		StringBuffer bf = new StringBuffer();
		// 返回类型为容器本身，可继续调用自身方法
		str1 = bf.append(str2).append(str1).toString();
		return str1;
	}

	// 反转字符串
	public String re_rang(String str1) {
		StringBuffer bf = new StringBuffer(str1);
		str1 = bf.reverse().toString();
		return str1;
	}

	// 对子字符串进行增删改查
	// StringBuilder:多线程，比较安全，以后都使用这个
	public String Link_Strings(String str1, String str2) {
		StringBuilder sd = new StringBuilder();
		sd.append(str2);
		sd.append(str1);
		str1 = sd.toString();
		return str1;
	}

	/*
	 * gbk、utf-8能解析汉字和英文字符; ISO-8859-1只能解析英文，不能解析汉字 ;gb2312只能解析简单中文，对繁体中文和部分汉字无效
	 * 
	 * java的字符串是unicode编码;Tomcat中默认编码形式是ISO-8859-1，网页中的编码由我们自己设定
	 */
	public String bianma(String str) {
		try {
			str = new String(str.getBytes("gbk"), "gbk");// 以gbk的形式进行编码和解码
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;
	}
}
