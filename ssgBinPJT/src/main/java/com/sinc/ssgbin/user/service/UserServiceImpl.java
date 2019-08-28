package com.sinc.ssgbin.user.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.ssgbin.store.model.vo.StoreVO;
import com.sinc.ssgbin.user.model.dao.UserDAOImpl;
import com.sinc.ssgbin.user.model.vo.UserVO;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource(name="userDAO")
	private UserDAOImpl dao;
	
	@Override
	public UserVO login(UserVO user) {
		System.out.println("UserServiceImpl login()");
		return dao.login(user);
	}

	@Override
	public List<StoreVO> getStore(UserVO user) {
		System.out.println("UserServiceImpl getStore()");
		System.out.println(dao.getStore(user));
		return dao.getStore(user);
	}

}
