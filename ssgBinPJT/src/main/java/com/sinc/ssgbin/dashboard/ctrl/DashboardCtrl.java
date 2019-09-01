package com.sinc.ssgbin.dashboard.ctrl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sinc.ssgbin.dashboard.service.DashboardService;
import com.sinc.ssgbin.equipment.model.vo.EquipmentVO;
import com.sinc.ssgbin.log.model.vo.LogVO;
import com.sinc.ssgbin.log.service.LogService;
import com.sinc.ssgbin.store.model.vo.StoreVO;
import com.sinc.ssgbin.user.model.vo.UserVO;
import com.sinc.ssgbin.user.service.UserService;

@Controller
@RequestMapping("/dashboard")
public class DashboardCtrl {
	private int[] store5NumArr = {1,2,3,4};
	private int[] store6NumArr = {3,2,2,3};
	private int[] store7NumArr = {10,40,25,25};
	private int[] store8NumArr = {25,25,25,25};
	
	@Resource(name="dashboardService")
	private DashboardService service;
	@Resource(name="logService")
	private LogService logservice;
	
	@RequestMapping("/main")
	public String main() {
		System.out.println("DashboardCtrl main()");
		return "/dashboard/main";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public List<StoreVO> getStore(UserVO user) {
		System.out.println("DashboardCtrl getStore()");
		return service.getStore(user);
	}
	
	@RequestMapping("/status")
	@ResponseBody
	public List<EquipmentVO> getStatus(StoreVO store) {
		System.out.println("DashboardCtrl getStatus()");
		System.out.println(service.getEquipment(store));
		return service.getEquipment(store);
	}
	@RequestMapping("/analysis")
	public String analysis() {
		System.out.println("DashboardCtrl analysis()");
		return "/dashboard/analysis";
	}
	
	@RequestMapping("/log")
	public String logPage() {
		System.out.println("LogCtrl logPage()");
		return "/dashboard/log";
	}
	
	@RequestMapping(value="/loglist",  method=RequestMethod.GET)
	@ResponseBody
	public List<LogVO> getLog() {
		System.out.println("LogCtrl getLog()");
		System.out.println(logservice.getLog());
		
		return logservice.getLog();
	}
	
	@RequestMapping(value="/loglist",  method=RequestMethod.POST)
	@ResponseBody
	public List<LogVO> getLog(String filter) {
		System.out.println("LogCtrl getLog()");
		List<LogVO> result = null;
		if (filter.equals("ssgbin")) {
			result = logservice.getSsgbinList("SSG Bin");
		}else if(filter.equals("icemaker")) {
			result = logservice.getSsgbinList("제빙기");
		}else if(filter.equals("refrigerator")) {
			result = logservice.getSsgbinList("냉장고");
		}else if(filter.equals("light")) {
			result = logservice.getSsgbinList("조명");
		}else if(filter.equals("airconditioner")) {
			result = logservice.getSsgbinList("에어컨");
		}else if(filter.equals("전체 보기")) {
			result = logservice.getLog();
		}
		System.out.println(result);
		return result;
	}
	@RequestMapping("/data")
	@ResponseBody
	public int[] getData(String storeId) {
		if (storeId.equals("5")) {
			return store5NumArr;
		} else if (storeId.equals("6")) {
			return store6NumArr;
		} else if (storeId.equals("7")) {
			return store7NumArr;
		} else if (storeId.equals("8")) {
			return store8NumArr;
		} else {
			int [] resultNumArr = new int[4];
			for(int i = 0; i < resultNumArr.length; i++) {
				resultNumArr[i] = store5NumArr[i] + store6NumArr[i] + store7NumArr[i] + store8NumArr[i];
			}
			return resultNumArr;
		}
	}
}
