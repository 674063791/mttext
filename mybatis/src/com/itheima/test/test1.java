package com.itheima.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.itheima.dao.MapperUser;
import com.itheima.dao.OrderMapper;
import com.itheima.domian.OrderUser;
import com.itheima.domian.Orders;
import com.itheima.domian.QueryVo;
import com.itheima.domian.User;



public class test1 {
	@Test
	public void runqw() throws IOException{
		String s="SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(s);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sessionFactory.openSession();
		MapperUser mapper = session.getMapper(MapperUser.class);
		User user = mapper.getUserById(1);
		System.out.println(user);
		session.close();
		
	}
	@Test
	public void runqw2() throws IOException{
		String s="SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(s);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sessionFactory.openSession();
		MapperUser mapper = session.getMapper(MapperUser.class);
		List<User> list = mapper.getUserByName("王");
		System.out.println(list);
		session.close();
		
	}
	@Test
	public void runqw3() throws IOException{
		String s="SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(s);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sessionFactory.openSession();
		MapperUser mapper = session.getMapper(MapperUser.class);
		User user = new User();
		user.setId(32);
		user.setUsername("特朗普");
		mapper.updateUser(user);
		session.commit();
		session.close();
		
	}
	@Test
	public void runqw4() throws IOException{
		String s="SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(s);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sessionFactory.openSession();
		MapperUser mapper = session.getMapper(MapperUser.class);
		User user = new User();
		user.setAddress("北京市 朝阳区");
		user.setSex("1");
		user.setUsername("报关单三");
		user.setBirthday(new Date());
		mapper.addUser(user);
		System.out.println(user.getId());
		session.commit();
		session.close();
	}
	@Test
	public void runqw5() throws IOException{
		String s="SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(s);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sessionFactory.openSession();
		MapperUser mapper = session.getMapper(MapperUser.class);
		mapper.deleteUserById(36);
		session.commit();
		session.close();
	}
	@Test
	public void runqw6() throws IOException{
		String s="SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(s);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sessionFactory.openSession();
		MapperUser mapper = session.getMapper(MapperUser.class);
		QueryVo vo = new QueryVo();
		User user = new User();
		
		user.setUsername("王健林");
		vo.setUser(user);
		List<User> list = mapper.findOneByName(vo);
		System.out.println(list);
		session.commit();
		session.close();
	}
	@Test
	public void runqw7() throws IOException{
		String s="SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(s);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sessionFactory.openSession();
		MapperUser mapper = session.getMapper(MapperUser.class);
		Integer countUser = mapper.countUser();
		System.out.println(countUser+"=====================================");
		session.commit();
		session.close();
	}
	@Test
	public void runqw8() throws IOException{
		String s="SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(s);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sessionFactory.openSession();
		OrderMapper mapper = session.getMapper(OrderMapper.class);
		List<Orders> list = mapper.selectOrdersList();
		for (Orders orders : list) {
			System.out.println(orders);
		}
		session.commit();
		session.close();
	}
	@Test
	public void runqw9() throws IOException{
		String s="SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(s);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sessionFactory.openSession();
		MapperUser mapper = session.getMapper(MapperUser.class);
		User user = new User();
		user.setUsername("张三");
		//user.setSex("1");
		List<User> selectUser = mapper.selectUserSexAndName(user);
		for (User user2 : selectUser) {
			System.out.println(user2);
		}
		session.commit();
		session.close();
	}
	@Test
	public void runqw10() throws IOException{
		String s="SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(s);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sessionFactory.openSession();
		MapperUser mapper = session.getMapper(MapperUser.class);
		User user = new User();
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(24);
		arrayList.add(25);
		arrayList.add(26);
		user.setIds(arrayList);
		List<User> list = mapper.getUserByaForId(user);
		for (User user2 : list) {
			System.out.println(user2);
		}
		
		session.commit();
		session.close();
	}
	@Test
	public void runqw11() throws IOException{
		String s="SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(s);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sessionFactory.openSession();
		MapperUser mapper = session.getMapper(MapperUser.class);
		OrderUser orderUser = mapper.getOrderUserById(3);
		System.out.println(orderUser);
		session.commit();
		session.close();
	}
	@Test
	public void runqw12() throws IOException{
		String s="SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(s);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sessionFactory.openSession();
		OrderMapper mapper = session.getMapper(OrderMapper.class);
		List<Orders> list = mapper.getOrdersMap();
		for (Orders orders : list) {
			System.out.println(orders);
		}
		session.commit();
		session.close();
	}	
	@Test
	public void runqw13() throws IOException{
		String s="SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(s);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sessionFactory.openSession();
		OrderMapper mapper = session.getMapper(OrderMapper.class);
		
	List<User> user = mapper.getOrdersById();
		for (User user2 : user) {
			System.out.println(user2);
		}
		session.commit();
		session.close();
	}
}
