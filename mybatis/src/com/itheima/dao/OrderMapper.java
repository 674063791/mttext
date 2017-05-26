package com.itheima.dao;

import java.util.List;

import com.itheima.domian.Orders;
import com.itheima.domian.User;

public interface OrderMapper {
	public List<Orders> selectOrdersList();
	public List<Orders> getOrdersMap();
	public List<User> getOrdersById();
}
