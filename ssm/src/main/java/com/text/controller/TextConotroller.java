package com.text.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.text.model.UserSearch;
import com.text.service.UserService;
import com.text.util.UserSearchUtil;

@Controller
@RequestMapping("fmovice")
public class TextConotroller {
	
	@Resource private UserService userservice;
	
	@RequestMapping("addMessage")
	public void MessageText(HttpServletRequest request,HttpServletResponse response,UserSearch userSearch) throws IOException{
		PrintWriter out=response.getWriter();
		if(userSearch.getUrl()!=null){
			userSearch=UserSearchUtil.setMessage(userSearch);
			userservice.addUrl(userSearch);
			out.print("添加纪录成功");
		}else{
			out.print("获取数据失败");
		}
		
		if(out!=null){
			out.close();
		}
	}
}
