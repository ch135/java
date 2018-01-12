package com.itcase.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @author scholarly
 * <p>Collections：集合工具类，含有对集合进行排序、查询和修改等工作</p>
 */
public class CollectionTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		@SuppressWarnings("rawtypes")
		//创建线程同步的集合，解决多线程访问的安全问题
		List<?> li=Collections.synchronizedList(new ArrayList());
		Map<Object, Object> map=Collections.synchronizedMap(new HashMap<Object, Object>(10));
		li.clear();
		map.clear();
	}
}