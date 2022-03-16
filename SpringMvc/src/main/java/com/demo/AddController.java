package com.demo;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		
		String k="govindsharma";
		String l="govind";
		
		String i=request.getParameter("t1"); 
		
		String j=request.getParameter("t2"); 

		ModelAndView mv= new ModelAndView(); 
		
		if(i==k & j==l) {
			String p="login successfull";

			mv.setViewName("display.jsp");
			mv.addObject("result",p);
			return mv;
			
			
		}
		else {
			String a="Incorrect credentials";
			mv.setViewName("display.jsp");
			mv.addObject("result",a);
			return mv;
			
			
		}
		
		
		 
		
		
		
		
	}

}



