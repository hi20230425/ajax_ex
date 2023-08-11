package com.mysite.ajax_ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
	
	@GetMapping("/")
	public String indexView () {
		return "index"; 
	}
	
	@GetMapping ("/ex01")		//http://localhost:9797/ex01
	public String Ex01View() {
		
		return "ajax-ex-01"; 
	}
	
	@GetMapping("/ajax/ex01")	// Ajax를 통한 비동기 통신 
	public String Ex01Ajax() {
		
		return "index"; 		//index 페이지의 소스 정보가 클라이언트로 전송 
	}
	
	
	@GetMapping ("/ex02")		//http://localhost:9797/ex01
	public String Ex02View() {
		
		return "ajax-ex-02"; 
	}
	
	@GetMapping("/ajax/ex02")	// Ajax를 통한 비동기 통신 
	public @ResponseBody String Ex02Ajax() {
		
		return "index"; 	// @ResponseBody : 리턴 타입 앞에 할당, JSON 포멧으로 변환후 전송 	

	}

}
