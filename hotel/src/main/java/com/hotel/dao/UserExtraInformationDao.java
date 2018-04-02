package com.hotel.dao;

import com.hotel.model.UserExtraInformation;

public interface UserExtraInformationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserExtraInformation record);

    int insertSelective(UserExtraInformation record);

    UserExtraInformation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserExtraInformation record);

    int updateByPrimaryKey(UserExtraInformation record);
}