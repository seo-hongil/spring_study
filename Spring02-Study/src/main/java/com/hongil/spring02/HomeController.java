package com.hongil.spring02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("/home") 
	public String home() {

		return "home";
	}
}



