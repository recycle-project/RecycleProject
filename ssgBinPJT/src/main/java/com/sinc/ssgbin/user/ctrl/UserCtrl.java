package com.sinc.ssgbin.user.ctrl;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sinc.ssgbin.user.model.vo.UserVO;
import com.sinc.ssgbin.user.service.UserService;

@Controller
@SessionAttributes({"user"})
@RequestMapping("/user")
public class UserCtrl {
	@Resource(name="userService")
	private UserService service;
	
	@RequestMapping("/loginForm")
	public String loginForm() {
		System.out.println("UserCtrl loginForm()");
		return "/user/loginForm";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(UserVO user, Model model, RedirectAttributes rttr) {
		System.out.println("UserCtrl login()");
		System.out.println(user.getEmployee_name());
		System.out.println("user info trying login >>>> " +user.getEmployee_name() + user.getPwd());
		
		UserVO result = service.login(user);
		if(result!=null) {
			System.out.println("result: " + result.toString());
			
			
			model.addAttribute("user", result);
			System.out.println(service.getStore(result));
			rttr.addFlashAttribute("storeList", service.getStore(result));
			
			// session 작업이 필요한 부분.
			// 위에 @SessionAttributes 어노테이션으로 mapping.
			
			
			return "redirect:/dashboard/analysis";	// return을 interceptor에게 넘겼다!
		} else {
			// 만약 로그인페이지로 돌아가면서 하면서 id, pwd 값을 유지한다면? 
			System.out.println("no user data");
			return "redirect:/";	// return을 interceptor에게 넘겼따.
		}
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		System.out.println("UserCtrl logout()");
		session.invalidate();
		return "redirect:/";
	}
}
