package com.itcase.test;

import java.util.stream.IntStream;
import java.util.stream.IntStream.Builder;
//stream代表多个支持串行和并行聚集操作的元素
public class StreamTest {
	public static void main(String[] args){
		//获取Builder对象来创建IntStream
		Builder bud=IntStream.builder();
		bud.add(1);
		bud.add(2);
		bud.add(3);
		//将BUilder对象转化为IntStream
		IntStream in=bud.build();
		/*
		 * 将in映射成一个新Stream;
		 * map：中间方法，使流保持打开状态，允许直接调用后序方法
		 */
		IntStream ins=in.map(ele->ele*2);
		//末端方法，对流进行消耗且不再可用。如sum(),count().avaage()等方法
		//System.out.println(in.max().getAsInt());
		ins.forEach(System.out::println);
	}
}