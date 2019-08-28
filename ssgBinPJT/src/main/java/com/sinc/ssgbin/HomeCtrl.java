package com.sinc.ssgbin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrl {
	@RequestMapping("/")
	public String index() {
		System.out.println("HomeCtrl index()");
		return "index";
	}
}
