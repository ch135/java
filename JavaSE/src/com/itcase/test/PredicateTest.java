package com.itcase.test;

import java.util.Collection;
import java.util.HashSet;

public class PredicateTest {
	public static void main(String[] args){
		Collection<String> coll=new HashSet<String>();
		coll.add("1");
		coll.add("2");
		/*
		 * removeif(Predicate filter)批量删除filter条件的所有元素
		 * ele:Predicate指定的条件
		 */
		coll.removeIf(ele->((String)ele).length()>2);
		System.out.println(coll);
	}
}
