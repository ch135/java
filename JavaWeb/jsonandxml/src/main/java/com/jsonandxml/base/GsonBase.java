package com.jsonandxml.base;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.jsonandxml.model.Student;

/**
 * 
 * @author scholarly
 * @time 2018/1/15
 * <p>Gson:功能完善，使用前要先创建对应json的bean对象，性能弱于Fastjson；</p>
 * FastJson:parse性能高，复杂Json与bean之间得转化时会出错。
 */
public class GsonBase {
	
	/**
	 * 
	 * @param students
	 * @param gson
	 * @return 转化后的json字符串
	 * <p>bean to json by Gson</p>
	 */
	public String toJson(Student student,Gson gson) {
		String json = gson.toJson(student);
		return json;
	}
	
	/**
	 * 
	 * @param json
	 * @param gson
	 * @return 转化后的bean对象
	 * <p>json to bean by Gson</p>
	 */
	public Student toBean(String json,Gson gson) {
		Student student = gson.fromJson(json,Student.class);
		return student;
	}
	
	/**
	 * 
	 * @param json
	 * @param gson
	 * @return bean对象的List集合
	 * <p>json to beans by Gson</p>
	 */
	public List<Student> toBeanList(String json,Gson gson){
		List<Student> list=gson.fromJson(json, new TypeToken<List<Student>>() {}.getType());
		return list;
	}
	
	/**
	 * 
	 * @return 规定bean日期格式的Gson对象
	 */
	public Gson buildTime(){
		GsonBuilder builder=new GsonBuilder();
		builder.setDateFormat("yyyy-MM-dd HH:mm:SS");
		Gson gson=builder.create();
		return gson;
	}
	
	
}
