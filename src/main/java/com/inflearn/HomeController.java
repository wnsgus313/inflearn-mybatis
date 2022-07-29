package com.inflearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inflearn.service.QuestionService;

@Controller
public class HomeController {
	@RequestMapping(value = "/")
	public String home(Model m) {
		
		return "index";
	}
}
