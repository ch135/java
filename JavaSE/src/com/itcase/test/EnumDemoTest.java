package com.itcase.test;

//枚举类不能被继承，不能继承父类，也不能派生出子类
public enum EnumDemoTest {
	plus{
		public int eval(int a,int b){
			return a+b;
		}
	},
	minus{
		public int eval(int a,int b){
			return a-b;
		}
	};
	//拥有抽象方法的枚举
	public abstract int eval(int a,int b);
	
	public static void main(String[] args){
		System.out.println(EnumDemoTest.plus.eval(3, 4));
		System.out.println(EnumDemoTest.minus.eval(3, 4));
		//通过valueof()方法获取枚举值
		EnumDemoTest en=Enum.valueOf(EnumDemoTest.class, "plus");
		System.out.println(en);
	}
}