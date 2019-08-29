package com.sinc.ssgbin.user.model.dao;

import java.util.List;

import com.sinc.ssgbin.store.model.vo.StoreVO;
import com.sinc.ssgbin.user.model.vo.UserVO;

public interface UserDAO {
	public UserVO login(UserVO user);
	public List<StoreVO> getStore(UserVO user);
	public int updateToken(UserVO user);
}
