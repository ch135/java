package com.itcase.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
/*
 * @author chenhao
 * @date 2017/12/31
 * <p> HashSet不是同步的；在同一hash值上放置不同值时，会降低其搜索效率 </p>
 * <p> LinkedHashSet:HashSet的子集，使用链表维护数组的顺序  </p>
 */
public class HashSetTest {
	
	public static void main(String[] args){
		
		HashSet<String> hs=new HashSet<String>();
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
