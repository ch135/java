package com.itcase.test;

import java.util.regex.Pattern;

public class RegexTest2 {
	public static void main(String[] args){
		text();
	}
	
	//正则表达式的模式
	public static void text(){
		String st="hello word";
		//贪婪模式；尽量多地替换字符串
		System.out.println(st.replaceFirst("\\w*", "llll"));
		//勉强模式，尽量少的替换字符串
		System.out.println(st.replaceFirst("\\w*?", "llll"));
	}
	
	public static void Basic(){
		Pattern.compile("a*b");
	}
}
