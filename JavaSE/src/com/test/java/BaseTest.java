package com.test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import com.itcase.test.BaseTypeTest;

public class BaseTest {
	
	/*
	 * @author chenhao
	 * @date 2017/12/31
	 * <p>基本数据类型方法测试</p>
	 */
	@Test(timeout=4)
	public void testChange() {
		int c=new BaseTypeTest().Change();
		assertEquals(12132, c);
	}
	
	
}
