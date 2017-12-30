package com.itcase.test;

final class Text{
	//宏变量
	public final int a=5;
	public void demo1(){
		System.out.println("final类不能有子类");
	}
	
	public final void demo2(){
		System.out.println("final方法不能被重写");
	}
}

public class FinalDemoTest{
	public static void main(String[] args){
		Text te=new Text();
		te.demo1();
		te.demo2();
		
	}
}