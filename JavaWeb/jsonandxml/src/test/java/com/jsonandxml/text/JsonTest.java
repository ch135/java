package com.jsonandxml.text;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.google.gson.Gson;
import com.jsonandxml.base.GsonBase;
import com.jsonandxml.base.ValueBase;
import com.jsonandxml.model.Student;

/**
 * 
 * @author scholarly
 * @time 2018/1/16
 * <p>Json测试类</p>
 */
public class JsonTest extends ValueBase{
	
	private static Student student;
	private static Gson gson;
	static{
		student=new Student();
		student.setName(ValueBase.STUDENT_NAME);
		student.setAge(ValueBase.STUDENT_AGE);
		student.setPhoneNumber(ValueBase.STUDENT_PHONENAME);
	}
	
	@Test
	public void toJsonTest(){
		GsonBase jsonbase=new GsonBase();
		assertEquals("",jsonbase.toJson(student,gson));
	}
	
	@Test
	@Ignore
	public void toBeanTest(){
		GsonBase jsonbase=new GsonBase();
		String studentjson=jsonbase.toJson(student,gson);
		assertEquals("", jsonbase.toBean(studentjson,gson));
	}
}
