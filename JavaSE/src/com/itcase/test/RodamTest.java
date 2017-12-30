package com.itcase.test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RodamTest {
	public static void main(String[] args){
		//Random产生随机数
		Random rand=new Random();
		int a=rand.nextInt();
		//ThreadLocalRandom：产生随机数--》实用与多线程
		ThreadLocalRandom trom=ThreadLocalRandom.current();
		int b=trom.nextInt(0, 10);
		System.out.println(a);
		System.out.println(b);
	}
}
