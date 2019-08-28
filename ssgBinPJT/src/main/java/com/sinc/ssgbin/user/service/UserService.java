package com.sinc.ssgbin.user.service;

import java.util.List;

import com.sinc.ssgbin.store.model.vo.StoreVO;
import com.sinc.ssgbin.user.model.vo.UserVO;

public interface UserService {
	public UserVO login(UserVO user);
	public List<StoreVO> getStore(UserVO user);
}
