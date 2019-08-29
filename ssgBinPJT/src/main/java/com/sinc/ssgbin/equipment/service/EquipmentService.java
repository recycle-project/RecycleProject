package com.sinc.ssgbin.equipment.service;

import java.util.HashMap;
import java.util.List;

import com.sinc.ssgbin.equipment.model.vo.EquipmentVO;
import com.sinc.ssgbin.user.model.vo.UserVO;

public interface EquipmentService {
	public List<UserVO> getUsersWithEquipId(EquipmentVO equip);
	public HashMap<String, String> getPushContentWithEquipId(EquipmentVO equip);
}
