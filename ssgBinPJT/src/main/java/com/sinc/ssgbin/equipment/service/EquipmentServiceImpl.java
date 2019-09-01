package com.sinc.ssgbin.equipment.service;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.ssgbin.equipment.model.dao.EquipmentDAOImpl;
import com.sinc.ssgbin.equipment.model.vo.EquipmentVO;
import com.sinc.ssgbin.user.model.vo.UserVO;

@Service("equipmentService")
public class EquipmentServiceImpl implements EquipmentService {
	@Resource(name="equipmentDAO")
	private EquipmentDAOImpl dao;
	
	@Override
	public List<UserVO> getUsersWithEquipId(EquipmentVO equip) {
		System.out.println("EquipmentServiceImpl getUsersWithEquipId()");
		return dao.getUsersWithEquipId(equip);
	}
	
	@Override
	public HashMap<String, String> getPushContentWithEquipId(EquipmentVO equip){
		System.out.println("EquipmentServiceImpl getPushContentWithEquipId()");
		return dao.getPushContentWithEquipId(equip);
	}

	@Override
	public EquipmentVO getEquipmentWithId(int id) {
		System.out.println("EquipmentServiceImpl getEquipmentWithId()");
		return dao.getEquipmentWithId(id);
	}
	
	@Override
	public int updateUltra(EquipmentVO equip) {
		System.out.println("EquipmentServiceImpl updateUltra()");
		return dao.updateUltra(equip);
	}
}
