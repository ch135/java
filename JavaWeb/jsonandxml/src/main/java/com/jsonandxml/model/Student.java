package com.jsonandxml.model;

/**
 * 
 * @author scholarly
 * <p>2018/1/15</p>
 * <span>学生信息模型</span>
 */
public class Student {
	public String name;
	public String phoneNumber;
	public int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
