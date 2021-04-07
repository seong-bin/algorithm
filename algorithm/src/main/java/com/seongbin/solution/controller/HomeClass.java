package com.seongbin.solution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeClass {
	@RequestMapping(value="/")
	public String index() {
		
		return "index";
	}
}
