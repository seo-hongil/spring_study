package com.hongil.spring03;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FriendsController {
	@RequestMapping("/friends")
	public String friends(HttpServletRequest request) {
		
		List<String> list=new ArrayList<String>();
		list.add("쿠알라보이");
		list.add("쿠알라걸스");
		
		request.setAttribute("list", list);
		return "friends";
	}
	
	@RequestMapping("/friends2")
	public ModelAndView friends2() {
		List<String> list=new ArrayList<String>();
		list.add("준영이");
		list.add("예솔이");
		list.add("연수");
		ModelAndView mView=new ModelAndView();
		mView.addObject("list", list);
		mView.setViewName("friends");
		return mView;
	}
	
	@RequestMapping("/friends3")
	public ModelAndView friends3(ModelAndView mView) {
		List<String> list=new ArrayList<String>();
		list.add("태동");
		list.add("두환");
		list.add("정주");
		
		mView.addObject("list", list);
		mView.setViewName("friends");
		return mView;
	}
	
	
}
