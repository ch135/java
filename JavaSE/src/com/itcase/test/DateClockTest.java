package com.itcase.test;

import java.util.Timer;
import java.util.TimerTask;
/*
 * Timer类可以定期或指定时间来执行任务，线程安全
 */

public class DateClockTest {
	 public static void main(String[] args){
		//获得的是自1970-1-01 00:00:00.000 到当前时刻的时间距离
     	long time=System.currentTimeMillis();
     	TimerTask task = new TimerTask() {  
            //	TimeTask是抽象类，第一个参数是子类的一个对象
            public void run() {
            	//用于创建格式化的字符串以及连接多个字符串对象
                String str = String.format("%1$tM:%1$tS:%1$1tL", System.currentTimeMillis() - time);  
                System.out.println(str);
            }
        };
        //1毫秒后开始。每100毫秒责行一次任务
        new Timer().schedule(task, 1, 100);       
	}
}