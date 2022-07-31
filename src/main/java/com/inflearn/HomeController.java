package com.inflearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inflearn.service.UserService;
import com.inflearnVO.UserVO;


@Controller
public class HomeController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/")
	public String home(Model m) {
		
		return "index";
	}
	
	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping(value = "/loginOk", method=RequestMethod.POST)
	public String loginOK(String name, String password, HttpSession session) {
		String returnUrl = "";
		
		if(session.getAttribute("name") != null) {
			session.removeAttribute("name");
		}
		
		Map<String, Object> beforeInfo = new HashMap<String, Object>();
		beforeInfo.put("name", name);
		beforeInfo.put("password", password);
		
		Map<String, Object> info = new HashMap<String, Object>();
		info.put("info", beforeInfo);
		
		
		UserVO user = userService.getUserByInfo(info);

		if(user != null) {
			if(user.getName().equals(name) && user.getPassword().equals(password)) {
				session.setAttribute("name", name);
			}
			returnUrl = "redirect:/";
		}else {
			returnUrl = "logfail";
		}
		
		return returnUrl;
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("name");
		
		return "index";
	}
}
