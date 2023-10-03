package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	
//	@RequestMapping(path = "/")
//	@ResponseBody
//	public String getMessage() {
//		
//		return "<h1 style='text-align:center'>Jeevan Blood Bank</h1>";
//	}
	
	@RequestMapping(path = "/")
	public String getMessage() {
		
		return "index";
		
				}
}

