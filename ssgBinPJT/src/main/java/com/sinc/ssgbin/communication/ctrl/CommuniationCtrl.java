package com.sinc.ssgbin.communication.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class CommuniationCtrl {
	@RequestMapping("pi")
	public void communicate() {
		System.out.println("Communication !!!");
	}
}
