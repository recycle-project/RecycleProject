package com.sinc.ssgbin.user.model.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sinc.ssgbin.store.model.vo.StoreVO;
import com.sinc.ssgbin.user.model.vo.UserVO;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO{
	@Resource(name="sqlSession")
	private SqlSession session;	
	
	@Override
	public UserVO login(UserVO user) {
		System.out.println("USERDAOImpl login()");
		System.out.println("session >>>> " + session);
		return session.selectOne("com.sinc.ssgbin.user.login", user);
	}

	@Override
	public List<StoreVO> getStore(UserVO user) {
		System.out.println("USERDAOImpl getStore()");
		System.out.println(user);
		return session.selectList("com.sinc.ssgbin.store.list", user);
	}
}
