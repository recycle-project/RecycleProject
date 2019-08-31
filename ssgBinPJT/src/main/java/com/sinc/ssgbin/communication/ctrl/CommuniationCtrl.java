package com.sinc.ssgbin.communication.ctrl;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sinc.ssgbin.equipment.model.vo.EquipmentVO;
import com.sinc.ssgbin.equipment.service.EquipmentService;
import com.sinc.ssgbin.log.model.vo.LogVO;
import com.sinc.ssgbin.log.service.LogService;

@Controller

public class CommuniationCtrl {
	@Resource(name="equipmentService")
	private EquipmentService equipmentService;
	
	@Resource(name="logService")
	private LogService logService;
	
	@RequestMapping("pi")
	public void communicate() {
		System.out.println("Communication !!!");
	}
	
	// PI에서 POST로 equipment_id, contents data를 전달받음
	// requests.post('http://0.0.0.0:8088/ssgBin/pi/writeLog', data = {'equipment_id':'62', 'contents':'로그 내용이 들어갑니다.'}
	@RequestMapping("pi/writeLog")
	@ResponseStatus(HttpStatus.OK)
	public void writeLog(@RequestParam int equipment_id, @RequestParam String contents) {
		System.out.println("CommunicationCtrl writeLog()");
		
		// log에 쓰려면 equipment의 category를 알아야 하고.... 그냥 id랑 contents를 DAO까지 끌고 가서 한번에 logDB에 wrtie할 수도 있지만, 
		// logService가 따로 있으니까 그냥 equip 가져와서 logService로 DB에 추가하자.
		EquipmentVO equip = equipmentService.getEquipmentWithId(equipment_id);
		
		LogVO newLog = new LogVO();
		newLog.setCategory(equip.getCategory());
		newLog.setEquipment_id(equipment_id);
		newLog.setContents(contents);
		
		if(equip != null) {
			if(logService.writeLog(newLog) != 0) {
				System.out.println("success to write log");
			}else {
				System.out.println("fail to write log");
			}
		}
	}
}
