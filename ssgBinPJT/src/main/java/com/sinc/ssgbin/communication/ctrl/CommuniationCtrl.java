package com.sinc.ssgbin.communication.ctrl;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinc.ssgbin.equipment.model.vo.EquipmentVO;
import com.sinc.ssgbin.equipment.service.EquipmentService;

@Controller

public class CommuniationCtrl {
	@Resource(name="equipmentService")
	private EquipmentService service;
	
	@RequestMapping("pi")
	public void communicate(EquipmentVO equip) {
		System.out.println("Communication !!!");
		//임의 데이터
			equip.setEquipment_id(2);
			equip.setCapacity(57);
			service.updateCapacity(equip);
			
	}
}
