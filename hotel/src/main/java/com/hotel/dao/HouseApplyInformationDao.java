package com.hotel.dao;

import com.hotel.model.HouseApplyInformation;

public interface HouseApplyInformationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(HouseApplyInformation record);

    int insertSelective(HouseApplyInformation record);

    HouseApplyInformation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseApplyInformation record);

    int updateByPrimaryKey(HouseApplyInformation record);
}