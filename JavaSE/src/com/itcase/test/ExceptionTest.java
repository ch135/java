package com.itcase.test;

/**
 * <h1>RunTimeException</h1>
 * 项目运行时异常，我们抓取的异常；
 * 抓取异常后，可进行事件回滚，记录或在控制台直接输出自定义的异常信息
 * <hr/>
 * 1.回滚：spring AOP中有回滚功能，只支持RuntimeException()异常回滚；不支持Exception或自定异常的回滚，要想回滚，收到设置。<br/>
 * 2.记录：使用log4j,logback等日志框架，SLF4J等日志模板。

 * @return 错误处理结果
 * @since JDK1.8
 * @author chenhao
 * @time 2017/12/29
 * 
 */
class MyException extends Exception{
	private static final long serialVersionUID = 1L;
	private int detail;
	/**
	 * 构造方法
	 */
	MyException(int a){
		detail=a;
	}
	
	/**
	 * 通过toString()方法将处理结果返回给调用函数
	 */
	@Override
	public String toString(){
		return "MyExcption ["+detail+"]";
	}
}

/**
 * @author scholarly
 * <p>测试方法类</p>
 */
public class ExceptionTest {
	/**
	 * 测试调用方法
	 */
	static void campara(int campareNumber)throws MyException{
		if(campareNumber>10){ throw new MyException(campareNumber); }
	}
	
	public static void main(String[] args) {
		try{
			campara(1);
			campara(20);
		}catch (MyException me) {
			System.out.println(me.toString());
		}
	}
}
