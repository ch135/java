package com.text.util;

import java.util.Date;

import com.text.model.UserSearch;

public class UserSearchUtil {
	
	public static UserSearch setMessage(UserSearch usersearch){
		usersearch.setSeacherTime(new Date());
		return usersearch;
	}
}
