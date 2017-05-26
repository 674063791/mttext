package com.itheima.dao;

import java.util.List;

import com.itheima.domian.OrderUser;
import com.itheima.domian.QueryVo;
import com.itheima.domian.User;

public interface MapperUser {
	public User getUserById(Integer id);
	public List<User> getUserByName(String name);
	public void updateUser(User user);
	public void addUser(User user);
	public void deleteUserById(Integer id);
	public List<User> findOneByName(QueryVo vo);
	public Integer countUser();
	public List<User> selectUserSexAndName(User user);
	public List<User> getUserByaForId(User user);
	public OrderUser getOrderUserById(Integer id);
	public User getOrdersById();
	
}
