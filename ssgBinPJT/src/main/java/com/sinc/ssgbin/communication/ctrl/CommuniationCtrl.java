package com.sinc.ssgbin.communication.ctrl;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sinc.ssgbin.equipment.model.vo.EquipmentVO;
import com.sinc.ssgbin.equipment.service.EquipmentService;

@Controller

public class CommuniationCtrl {
	@Resource(name="equipmentService")
	private EquipmentService service;
	
	@RequestMapping("pi")
	@ResponseStatus(HttpStatus.OK)
	public void communicate() {
		System.out.println("Communication !!!");
	}

	
	@RequestMapping("ultra")
	@ResponseStatus(HttpStatus.OK)
	public void ultra(EquipmentVO equipment) {
		System.out.println("CommuniationCtrl ultra()");
		service.updateUltra(equipment);
	}
}
