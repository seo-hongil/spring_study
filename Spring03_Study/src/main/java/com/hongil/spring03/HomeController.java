package com.hongil.spring03;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	@RequestMapping("/home")
	public String home(HttpServletRequest request) {
	
		List<String> noticeList=new ArrayList<String>();
		noticeList.add("장마철이 지나간다..");
		noticeList.add("이제는 가을인가..");
		
		request.setAttribute("noticeList", noticeList);
		return "home";
	}
	
}
