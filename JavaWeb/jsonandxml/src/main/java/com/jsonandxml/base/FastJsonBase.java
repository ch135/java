package com.jsonandxml.base;

import java.util.List;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.jsonandxml.model.Student;

/**
 * 
 * @author scholarly
 * @time 2018/1/16
 * <p>Gson:功能完善，使用前要先创建对应json的bean对象，性能弱于Fastjson；</p>
 * FastJson:parse性能高，复杂Json与bean之间得转化时会出错。
 */
public class FastJsonBase {

	/**
	 * 
	 * @param json
	 * @return bean对象
	 * <p>json to bean by FastJson</p>
	 */
	public Student toBean(String json) {
		Student student = JSON.parseObject(json,Student.class);
		return student;
	}
	
	/**
	 * 
	 * @param json
	 * @return bean的List集合
	 * <p>json to beans by FastJson</p>
	 */
	public List<Student> toBeans(String json) {
		List<Student> students=JSON.parseObject(json, new TypeReference<List<Student>>() {});
		return students;
	}
	
	/**
	 * 
	 * @param json
	 * @return 获取的值
	 * <p>get value by FastJson</p>
	 */
	public String getValue(String json) {
		JSONObject obj=JSON.parseObject(json);
		String name=(String) obj.get("name");
		return name;
	}
	
	/**
	 * 
	 * @param json
	 * @return 修改后的json
	 * <p>get value by FastJson</p>
	 */
	public String removeValue(String json) {
		JSONObject obj=JSON.parseObject(json);
		Set<String> set=obj.keySet();
		Object value = set.remove("name");
		json=set.toString();
		return json;
	}
}
