package com.sinc.ssgbin.fcm.ctrl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinc.ssgbin.equipment.model.vo.EquipmentVO;
import com.sinc.ssgbin.equipment.service.EquipmentService;
import com.sinc.ssgbin.fcm.service.FCMService;
import com.sinc.ssgbin.log.model.vo.LogVO;
import com.sinc.ssgbin.log.service.LogService;
import com.sinc.ssgbin.user.model.vo.UserVO;
import com.sinc.ssgbin.user.service.UserService;

/*
 * 김응준. 2019-08-28
 * Android와 통신하고 이상현상에 대해 Push Notification을 주는 컨트롤러
 */

@Controller
@RequestMapping("/fcm")
public class FCMCtrl {
	@Resource(name="userService")
	private UserService service;
	
	@Resource(name="equipmentService")
	private EquipmentService equipmentService;
	
	@Resource(name="fcmService")
	private FCMService fcmService;
	
	@Resource(name="logService")
	private LogService logService;
	
	// Android에서 디바이스 토큰을 받아서 DB에 저장
	@RequestMapping("/token")
	@ResponseBody
	public void receiveDeviceToken(UserVO user) {
		System.out.println("FCMCtrl receiveDeviceToken()");
		System.out.println("Device Token recv >>>> " + user.getEmployee_name() +", " +user.getPwd() + ", "+user.getToken());
		
		// Employee DB에 token 값 갱신
		if(user != null) {
			int result = 0;
			result = service.updateToken(user);
			
			if(result != -1) {
				System.out.println("Android에서 온 데이터를 DB에 갱신 성공!!");
				// success to update Employee table
			} else {
				// fail to update
				System.out.println("Android에서 온 데이터를 DB에 갱신 실패!!");
			}
		}
		
	}
	
	// IoT 이상 현상을 감지하면, 해당 IoT 관리자들의 모바일 디바이스로 푸시 알림을 보냄
	@RequestMapping("/powerOff")
	public void powerOff(EquipmentVO equip) {
		System.out.println("FCMCtrl powerOff()");
		
		// Dummy data - 원래는 iot 단에서 equipment_id를 담은 equip 객체를 넘겨줌
		// store_id = 5 , category = 제빙기 , equipment_name = icemaker, equipment_id = 62 , serial_number = 83yNB8bRgbSHv8MP
		int equipmentId = 62;
		equip.setEquipment_id(equipmentId);
		
		// 1. 해당 equip가 있는 store의 employee list 획득 (단, token 값이 null이 아닌 경우에만!)
		List<UserVO> users = equipmentService.getUsersWithEquipId(equip);
		// 2. 푸시 메시지에 들어갈 내용(매장 이름, 기기 이름)을 획득
		HashMap<String, String> push = equipmentService.getPushContentWithEquipId(equip);
		// 3. log DB에 기록
		LogVO log = new LogVO();
		log.setCategory(push.get("CATEGORY"));
		log.setContents("꺼짐");
		log.setEquipment_id(equip.getEquipment_id());
		if(logService.writeLog(log) == 1) {
			System.out.println("log 기록 성공!");
		} else {
			System.out.println("log 기록 실패!");
		}
		// 4. token 값을 통해 푸시 메시지 보냄
		if(users.size() != 0 
				&& push.get("STORE_NAME") != null 
				&& push.get("CATEGORY") != null ) {
			System.out.println("해당 equip이 있는 store의 employee list입니다.");
			for(int i=0; i<users.size(); i++) {
				System.out.println("Employee #"+i+": name=" + users.get(i).getEmployee_name() + ", token=" + users.get(i).getToken());
			}
			System.out.println("push: store="+push.get("STORE_NAME")+", equip="+push.get("CATEGORY"));
			
			// send push notification to users
			int result = 1; // fcmService.sendNotification(users, push);
			if(result == 1) {
				// 푸시 성공
			} else {
				// 푸시 실패
			}
			
		} else {
			// 타겟 store에 token을 가진 employee가 없다.
			System.out.println("No employees data with token.");
		}
		
	}
	
	
	
}
