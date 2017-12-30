package com.itcase.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayTest {
	 // 创建一个对象，该对象的数据占用堆内存；设置为null，当该变量没被引用时，会被垃圾回收机制回收
	Integer in=null;
	int[] a =new int[]{1,2,3,4,5,6};
	int[] b =new int[]{1,2,3,4,5,6};
	
	public void dingyi(){
		//创建一个局部变量，该变量占用栈内存；该方法调用结束后，栈内存中的数据会被清除
		@SuppressWarnings("unused")
		int a;
		//创建并实例化一个数组后，会开辟；两个内存来存放数据;一个用于存放数组引用变量（栈内存），一个存放数组变量（堆内存）
		@SuppressWarnings("unused")
		String[] str={"aa","bicia"};
	}
	
	//Arrays是数组处理类，jdk8才有
	public void way(){
		//复制数组a中的元素到c中
		@SuppressWarnings("unused")
		int[] c=Arrays.copyOf(a, 4);
		//对数组a进行从小到大排序
		Arrays.sort(a);
		//转化为一个字符串
		Arrays.toString(a);
		//将数组元素的值全部设置为a
		Arrays.fill(a, 'a');
		//利用计算机的并行能力对数组元素进行排序
		Arrays.parallelSort(a);
		//将数组转化为stream
		@SuppressWarnings("unused")
		IntStream str= Arrays.stream(a);
	}
}