package com.sinc.ssgbin.fcm.service;

import java.util.HashMap;
import java.util.List;

import com.sinc.ssgbin.user.model.vo.UserVO;

public interface FCMService {
	public int sendNotification(List<UserVO> users, HashMap<String, String> push);
}
