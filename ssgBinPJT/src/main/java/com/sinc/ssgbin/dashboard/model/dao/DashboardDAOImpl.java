package com.sinc.ssgbin.dashboard.model.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sinc.ssgbin.equipment.model.vo.EquipmentVO;
import com.sinc.ssgbin.store.model.vo.StoreVO;
import com.sinc.ssgbin.user.model.vo.UserVO;

@Repository("dashboardDAO")
public class DashboardDAOImpl implements DashboardDAO {
	@Resource(name="sqlSession")
	private SqlSession session;	
	
	@Override
	public List<StoreVO> getStore(UserVO user) {
		System.out.println("DashboardDAOImpl getStore()");
		System.out.println(user);
		return session.selectList("com.sinc.ssgbin.store.list", user);
	}

	@Override
	public List<EquipmentVO> getEquipment(StoreVO store) {
		System.out.println("DashboardDAOImpl getEquipment()");
		System.out.println(store);
		return session.selectList("com.sinc.ssgbin.equipment.list", store);
	}

}
