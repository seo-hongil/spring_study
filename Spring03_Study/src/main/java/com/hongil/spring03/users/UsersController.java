package com.hongil.spring03.users;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsersController {
	@RequestMapping("/users/signup_form")
	public String signupForm() {
		
		return "users/signup_form";
	}
	@RequestMapping("users/signup")
	public String signup(HttpServletRequest request) {
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		System.out.println(id+"|"+pwd);
		return "users/signup";
	}
	
	@RequestMapping("/users/signup2")
	public String signup2(String id, String pwd) {
		System.out.println(id+"|"+pwd);
		return "users/signup";
	}
	@RequestMapping("/users/signup3")
	public String signup3(@ModelAttribute UsersDto dto) {
		System.out.println(dto.getId()+"|"+dto.getPwd());
		return "users/signup";
	}
}
