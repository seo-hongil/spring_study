package com.hongil.spring04.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hongil.spring04.member.dao.MemberDao;
import com.hongil.spring04.member.dto.MemberDto;

@Controller
public class MemberController {
	@Autowired
	private MemberDao dao;
	
	@RequestMapping("/member/list")
	public ModelAndView list(ModelAndView mView) {
		List<MemberDto> list=dao.getList();
		mView.addObject("list",list);
		mView.setViewName("member/list");
		return mView;
	}
}
