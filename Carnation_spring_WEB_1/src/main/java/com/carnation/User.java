package com.carnation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class User {

	
	@GetMapping("/pintu")
	public int msg() {
//		ModelAndView mv = new ModelAndView();
//		
//		mv.addObject("msg", "Welcome User");
//		mv.setViewName("index.jsp");
		return 234;
	}

	@GetMapping("/chai")
	public ModelAndView msg2() {
		System.out.println("Welcome Fridents Chai pi lo..........");
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("msg", "Welcome Fridents Chai pi lo..........");
		mv.setViewName("index.jsp");
		return mv;
	}
	
}
