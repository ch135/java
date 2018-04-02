package com.text.serviceimpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.text.dao.UserSearchDao;
import com.text.model.UserSearch;
import com.text.service.UserService;

@Service(value="UserService")
@Transactional
public class UserServiceImpl implements UserService{

	@Resource private UserSearchDao searchdao;
	
	public int addUrl(UserSearch usersearch) {
		
		return searchdao.insertSelective(usersearch);
	}
	
}
