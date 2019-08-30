package com.sinc.ssgbin.equipment.model.dao;

import java.util.HashMap;
import java.util.List;

import com.sinc.ssgbin.equipment.model.vo.EquipmentVO;
import com.sinc.ssgbin.user.model.vo.UserVO;

public interface EquipmentDAO {
	public List<UserVO> getUsersWithEquipId(EquipmentVO equip);
	public HashMap<String, String> getPushContentWithEquipId(EquipmentVO equip);
	public EquipmentVO getEquipmentWithId(int id);
}
