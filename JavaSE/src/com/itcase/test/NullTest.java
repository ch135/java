package com.itcase.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class NullTest {
	public static void main(String[] args){
		String str = "a,b,c,,,,,,,";
		String[] arg = str.split(",");
		System.out.println(arg.length);
		
		/*
		 *  asList可以将数组转化为集合，但不可以对集合修改；
		 *  asList 的返回对象是一个 Arrays 内部类，并没有实现集合的修改方法。
		 *  Arrays.asList 体现的是适配器模式，只是转换接口，后台的数据仍是数组。 
		 */
		String[] atr = new String[] {"you", "wu"};
		List<String> list=Arrays.asList(atr);
		atr[1]="lll";
		System.out.println(list.get(0));
		
		// toArray()：将对象转化为数组
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("1");
		arr.add("2");
		System.out.println(arr.toArray(atr));
		
		// 不要在foreach循环里进行元素remove/add操作。remove使用Iterator方式。
		// 错误示例
		List<String> li=new ArrayList<String>();
		li.add("1");
		li.add("2");
		// remove()写出数据；遍历时读取数据，两者产生冲突
		for (String number : li) {
			if("2".equals(number)) { li.remove(number); }	
		}
		System.out.println(li.toString());
	}
}
