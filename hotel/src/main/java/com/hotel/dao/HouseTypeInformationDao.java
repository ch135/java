package com.hotel.dao;

import com.hotel.model.HouseTypeInformation;

public interface HouseTypeInformationDao {
    int deleteByPrimaryKey(Byte id);

    int insert(HouseTypeInformation record);

    int insertSelective(HouseTypeInformation record);

    HouseTypeInformation selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(HouseTypeInformation record);

    int updateByPrimaryKey(HouseTypeInformation record);
}