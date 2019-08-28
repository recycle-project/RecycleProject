package com.sinc.ssgbin.dashboard.ctrl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinc.ssgbin.dashboard.service.DashboardService;
import com.sinc.ssgbin.equipment.model.vo.EquipmentVO;
import com.sinc.ssgbin.store.model.vo.StoreVO;
import com.sinc.ssgbin.user.model.vo.UserVO;
import com.sinc.ssgbin.user.service.UserService;

@Controller
@RequestMapping("/dashboard")
public class DashboardCtrl {
	@Resource(name="dashboardService")
	private DashboardService service;
	
	@RequestMapping("/main")
	public String main() {
		System.out.println("DashboardCtrl main()");
		return "/dashboard/main";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public List<StoreVO> getStore(UserVO user) {
		System.out.println("DashboardCtrl getStore()");
		System.out.println(service.getStore(user));
		return service.getStore(user);
	}
	
	@RequestMapping("/status")
	@ResponseBody
	public List<EquipmentVO> getStatus(StoreVO store) {
		System.out.println("DashboardCtrl getStatus()");
		System.out.println(store);
		return service.getEquipment(store);
	}
	@RequestMapping("/analysis")
	public String analysis() {
		System.out.println("DashboardCtrl analysis()");
		return "/dashboard/analysis";
	}
}
