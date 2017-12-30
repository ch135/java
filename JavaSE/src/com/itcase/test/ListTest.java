package com.itcase.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/*
 * List:有序集合，内容可重复；在collec-
 * tion的基础上添加了根据索引操作元素的方法
 * 
 * ArrayList():List()的实现类；线程不安全
 * 
 * Arrays:操作数组的工具类；
 * Arrays.ArrayList：一个固定长度的List数组，
 * 只能遍历，不能修改
 */
public class ListTest {
	public static void main(String[] args){
		List<Integer> li=new ArrayList<Integer>();
		li.add(1);
		li.add(0);
		li.add(2);
		li.add(3);
		//将1到3（不包含）的内容截取成新的数组
		List<Integer> li2=li.subList(1, 3);
		System.out.println(li2);
		//在Iterator的基础上添加了向前迭代的功能
		ListIterator<Integer> lit=li.listIterator();
		while(lit.hasPrevious()){
			System.out.print(lit.previous());
		}
		//Arrays.asLine();将数组或指定位置的对象指定转化为List对象
		List<String> as=Arrays.asList("111","2222");
		//获取as的实现类
		System.out.println(as.getClass());
		as.forEach(System.out::println);
	}
}