package com.hotel.dao;

import java.util.List;

import com.hotel.model.OrderInformation;

public interface OrderInformationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderInformation record);

    int insertSelective(OrderInformation record);

    OrderInformation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderInformation record);

    int updateByPrimaryKey(OrderInformation record);
    
    List<OrderInformation> getOrderByStatus(Byte houseStatus);
}