package com.sinc.ssgbin.equipment.service;

import java.util.HashMap;
import java.util.List;

import com.sinc.ssgbin.equipment.model.vo.EquipmentVO;
import com.sinc.ssgbin.user.model.vo.UserVO;

public interface EquipmentService {
	public List<UserVO> getUsersWithEquipId(EquipmentVO equip);
	public HashMap<String, Object> getPushContentWithEquipId(EquipmentVO equip);
	public EquipmentVO getEquipmentWithId(int id);
	public int updateUltra(EquipmentVO equip);
	public int updatePower(EquipmentVO equip);
}
