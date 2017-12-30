package com.itcase.test;

public class ThreadFristTest extends Thread{
	//run方法就是线程的责行体;getName()获得线程的名字
	public void run(){//子线程
		System.out.println(getName()+"1");
	}
	
	public static void main(String[] args){//主线程
		System.out.println(Thread.currentThread().getThreadGroup());//currentThread()获取当前线程
		new ThreadFristTest().start();//启动线程
		new ThreadFristTest().start();
	}
}