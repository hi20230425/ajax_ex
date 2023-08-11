package com.mysite.ajax_ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AjaxController {
	
	@GetMapping ("/ex01")		//http://localhost:9797/ex01
	public String Ex01() {
		
		return "ajax-ex-01"; 
	}

}
