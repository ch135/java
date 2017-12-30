package com.itcase.test;

public class LambdaDemoTest {
	public static void main(String[] args){
		LambdaDemoTest lam=new LambdaDemoTest();
		lam.text1(()->System.out.println("Lambda表达式只有一条语句，可以省略花括号"));
		
		lam.text2(we->{
			System.out.println("只有一个形参时，省略圆括号");
		});
		//代码块只一句化时，即使需要返回值，也可以省略return.
		lam.text3((a,b)->a+b);
	}
	
	interface demo1{
		void text1();
	}
	interface demo2{
		void text2(String we);
	}
	interface add{
		int adds(int a,int b);
	}
	public void text1(demo1 e){
		e.text1();
	}
	
	public int text2(demo2 d){
		d.text2("dxqsdq");
		return 0;
	}
	public int text3(add a){
		System.out.println(a.adds(2, 3));
		return 0;
	}
}
