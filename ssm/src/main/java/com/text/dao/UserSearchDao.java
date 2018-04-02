package com.text.dao;

import com.text.model.UserSearch;

public interface UserSearchDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserSearch record);

    int insertSelective(UserSearch record);

    UserSearch selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserSearch record);

    int updateByPrimaryKey(UserSearch record);
}