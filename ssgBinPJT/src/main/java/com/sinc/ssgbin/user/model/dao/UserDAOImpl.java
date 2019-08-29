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
	
	@Override
	public int updateToken(UserVO user) {
		System.out.println("USERDAOImpl updateUser()");
		
		// valid user 확인
		UserVO valid = session.selectOne("com.sinc.ssgbin.user.login", user);
		
		if(valid != null) {
			// 등록된 사용자
			return session.update("com.sinc.ssgbin.user.updateToken", user);	
		} else {
			// 미등록 사용자
			return -1;
		}
	}
}
