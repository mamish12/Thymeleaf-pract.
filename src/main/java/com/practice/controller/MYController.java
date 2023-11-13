package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MYController {
	
	@RequestMapping(value = "/about",method = RequestMethod.GET)
	public String about()
	{
		System.err.println("Inside about handler ......");
		return "about";
	}

}
