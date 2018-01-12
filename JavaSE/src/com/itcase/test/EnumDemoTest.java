package com.itcase.test;

/**
 * @author scholarly
 * <p>枚举类不能被继承，不能继承父类，也不能派生出子类</p>
 */
public enum EnumDemoTest {
	//加法函数
	plus{
		@Override
		public int eval(int a,int b){
			return a+b;
		}
	},
	//减法函数
	minus{
		@Override
		public int eval(int a,int b){
			return a-b;
		}
	};
	public abstract int eval(int a,int b);
	
	public static void main(String[] args){
		System.out.println(EnumDemoTest.plus.eval(3, 4));
		System.out.println(EnumDemoTest.minus.eval(3, 4));
		//通过valueof()方法获取枚举值
		EnumDemoTest en=Enum.valueOf(EnumDemoTest.class, "plus");
		System.out.println(en);
	}
}