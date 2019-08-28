package com.sinc.ssgbin.dashboard.model.dao;

import java.util.List;

import com.sinc.ssgbin.equipment.model.vo.EquipmentVO;
import com.sinc.ssgbin.store.model.vo.StoreVO;
import com.sinc.ssgbin.user.model.vo.UserVO;

public interface DashboardDAO {
	public List<StoreVO> getStore(UserVO user);
	public List<EquipmentVO> getEquipment(StoreVO store);
}
