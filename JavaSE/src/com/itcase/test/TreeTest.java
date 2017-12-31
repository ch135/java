package com.itcase.test;

import java.util.TreeSet;
/*
 * TreeSet:
 * 1. 根据值的大小，以升序的方式进行排序；
 * 2. 可自己定制排序规则-》自己实现Compareable接口
 * 3. 插入对象时，会调用Compareable接口，调用
 * 	  compareTo()方法-》插入对象要相等
 * 4， 修改排好的TreeSet后，它不会重新排序，不要修改
 * 	     排好的TreeSet（HashSet）集合
 */
public class TreeTest {
	public static void main(String[] args){
		TreeSet<String> ts=new TreeSet<String>();
		ts.add(new String("jjjj"));
		ts.add(new String("jxccc"));
		ts.add("1");
		ts.add("5");
		System.out.println(ts);
	}
}
