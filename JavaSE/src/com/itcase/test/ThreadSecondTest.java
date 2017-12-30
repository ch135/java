package com.itcase.test;

public class ThreadSecondTest implements Runnable{
	
	@Override
	public void run() {
		System.out.println("llll");
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		ThreadSecondTest sh=new ThreadSecondTest();
		new Thread(sh,"线程一").start();
	}
}