package com.itcase.test;

/*
 * 说明：我们抓取异常后，可进行回滚，记录操作。
 * 1.回滚：spring AOP中有回滚功能，只支持RuntimeException()异常回滚；不支持Exception或自定异常的回滚，要想回滚，收到设置。
 * 2.记录：使用log4j,logback等日志框架，SLF4J等日志门面。
 */
/*
 * @author chenhao
 * @version 1.0
 * @param
 * @return 错误处理结果
 * @exception
 * @see
 * @since JDK1.8
 * @deprecated
 * @time 2017/12/29
 * 自己定义异常处理类，程序运行异常时，抓取异常返回处理结果
 */
class MyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int detail;
	/*
	 * 构造方法
	 */
	MyException(int a){
		detail=a;
	}
	
	/*
	 * 通过toString()方法将处理结果返回给调用函数
	 */
	public String toString(){
		return "MyExcption ["+detail+"]";
	}
}

/*
 * 测试方法类
 */
public class ExceptionTest {
	/*
	 * 测试调用方法
	 */
	static void Campara(int campareNumber)throws MyException{
		if(campareNumber>10){ throw new MyException(campareNumber); }
	}
	
	public static void main(String[] args) {
		try{
			Campara(1);
			Campara(20);
		}catch (MyException me) {
			System.out.println(me.toString());
		}
	}
}
