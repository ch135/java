package com.hotel.dao;

import com.hotel.model.HouseInformaion;

public interface HouseInformaionDao {
    int deleteByPrimaryKey(Integer id);

    int insert(HouseInformaion record);

    int insertSelective(HouseInformaion record);

    HouseInformaion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseInformaion record);

    int updateByPrimaryKey(HouseInformaion record);
}