package com.hotel.service;

import java.util.List;

import com.hotel.model.OrderInformation;

/**
 * 
 * @author chenhao
 * @time 2018/4/13
 * <p>订单服务接口</p>
 *
 */

public interface OrderInformationService {

	//添加订单
	public int addOrder(OrderInformation order);
	
	//获取入住或清扫的订单
	public List<OrderInformation> getOrder(Byte houseStatus);
	
	//改变房间状态
	public int changeStatus(OrderInformation order);
	
}
