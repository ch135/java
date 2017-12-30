package com.itcase.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
/*
 * Set集合中元素不能相等，没有顺序
 * 值相等：值和hash值同时相等
 * 
 * HashSet不是同步的；在同一hash
 * 值上放置不同值时，会降低其搜索效率
 * 
 * LinkedHashSet:HashSet的子集，
 * 使用链表维护数组的顺序
 */
public class HashSetTest {
	public static void main(String[] args){
		HashSet<String> hs=new HashSet<String>();
		//添加相同对象时,后者在前者基础上再加上一个值
		hs.add("s");
		hs.add("s");
		hs.add("h");
		System.out.println(hs);
		
		LinkedHashSet<String> lsh=new LinkedHashSet<String>();
		lsh.add("11111");
		lsh.add("2222");
		lsh.add("3333");
		System.out.println(lsh);
	}
}
