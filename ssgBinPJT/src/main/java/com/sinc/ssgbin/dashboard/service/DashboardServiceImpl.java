package com.sinc.ssgbin.dashboard.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.ssgbin.dashboard.model.dao.DashboardDAOImpl;
import com.sinc.ssgbin.equipment.model.vo.EquipmentVO;
import com.sinc.ssgbin.store.model.vo.StoreVO;
import com.sinc.ssgbin.user.model.vo.UserVO;

@Service("dashboardService")
public class DashboardServiceImpl implements DashboardService {
	@Resource(name="dashboardDAO")
	private DashboardDAOImpl dao;
	
	@Override
	public List<StoreVO> getStore(UserVO user) {
		System.out.println("DashboardServiceImpl getStore()");
		System.out.println(dao.getStore(user));
		return dao.getStore(user);
	}

	@Override
	public List<EquipmentVO> getEquipment(StoreVO store) {
		System.out.println("DashboardServiceImpl getEquipment()");
		return dao.getEquipment(store);
	}

}
