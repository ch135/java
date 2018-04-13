package com.hotel.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author chenhao
 * @time 2018/4/11
 * <p>日期工具类</p>
 */

public class DateUtil {

	// 格式化日期（格式是yyyy-MM-dd）
	public static String format(Date source) {
		String date=null;
		try{
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			date=simpleDateFormat.format(source);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return date;
	}
	
	//获取当前datatime
	public static String getDate(){
		Date date=new Date();
		DateFormat simpledateformat=new SimpleDateFormat();
		String datestr=simpledateformat.format(date);
		
		return datestr;
	}
}
