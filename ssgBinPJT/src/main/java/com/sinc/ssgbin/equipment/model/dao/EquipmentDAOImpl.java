package com.sinc.ssgbin.equipment.model.dao;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sinc.ssgbin.equipment.model.vo.EquipmentVO;
import com.sinc.ssgbin.user.model.vo.UserVO;

@Repository("equipmentDAO")
public class EquipmentDAOImpl implements EquipmentDAO{
	@Resource(name="sqlSession")
	private SqlSession session;
	
	@Override
	public List<UserVO> getUsersWithEquipId(EquipmentVO equip) {
		System.out.println("EquipmentDAOImpl getStore()");
		return session.selectList("com.sinc.ssgbin.equipment.userList", equip);
	}
	
	@Override
	public HashMap<String, Object> getPushContentWithEquipId(EquipmentVO equip){
		System.out.println("EquipmentDAOImpl getPushContentWithEquipId()");
		return session.selectOne("com.sinc.ssgbin.equipment.push", equip);
	}

	@Override
	public EquipmentVO getEquipmentWithId(int id) {
		System.out.println("EquipmentDAOImpl getEquipmentWithId()");
		return session.selectOne("com.sinc.ssgbin.equipment.get", id);
	}

	@Override
	public int updatePower(EquipmentVO equip) {
		System.out.println("EquipmentDAOImpl updatePower()");
		return session.update("com.sinc.ssgbin.equipment.updatePower", equip);
	}

}
