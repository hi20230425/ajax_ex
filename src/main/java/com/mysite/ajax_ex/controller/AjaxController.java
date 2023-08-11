package com.mysite.ajax_ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysite.ajax_ex.dto.AjaxDTO;

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
	
	
	@GetMapping ("/ex02")		//http://localhost:9797/ex02
	public String Ex02View() {
		
		return "ajax-ex-02"; 
	}
	
	@GetMapping("/ajax/ex02")	// Ajax를 통한 비동기 통신 
	public @ResponseBody String Ex02Ajax() {
		
		return "index"; 	// @ResponseBody : 리턴 타입 앞에 할당, JSON 포멧으로 변환후 전송 	

	}
	
	@GetMapping ("/ex03")		//http://localhost:9797/ex03
	public String Ex03View() {
		
		return "ajax-ex-03"; 
	}
	
	
	// client Ajax 에서 변수값을 넘김  @RequestParam 어노테이션으로 값을 받기 
	@GetMapping("/ajax/ex03")	// Ajax를 통한 비동기 통신 
	public @ResponseBody String Ex03Ajax(
			@RequestParam String param1, @RequestParam String param2
			) {
		System.out.println("Ajax Controller : ext03 요청 성공 ");
		System.out.println("param1 : " + param1);
		System.out.println("param2 : " + param2);
		
		
		return "ex03 요청 처리 완료됨"; 	// @ResponseBody : 리턴 타입 앞에 할당, JSON 포멧으로 변환후 전송 	

	}
	
	@GetMapping ("/ex04")		//http://localhost:9797/ex04
	public String Ex04View() {
		
		return "ajax-ex-04"; 
	}
	
	
	// client Ajax 에서 변수값을 넘김  @RequestParam 어노테이션으로 값을 받기 
	@PostMapping("/ajax/ex04")	// Ajax를 통한 비동기 통신 
	public @ResponseBody String Ex04Ajax(
			@RequestParam String param1, @RequestParam String param2
			) {
		System.out.println("Ajax Controller : ext04 요청 성공 ");
		System.out.println("param1 : " + param1);
		System.out.println("param2 : " + param2);
		
		
		return "ex04 요청 처리 완료됨"; 	// @ResponseBody : 리턴 타입 앞에 할당, JSON 포멧으로 변환후 전송 	

	}
	
	@GetMapping ("/ex05")		//http://localhost:9797/ex05
	public String Ex05View() {
		
		return "ajax-ex-05"; 
	}
	
	// client Ajax 에서 변수값을 넘김  @RequestParam 어노테이션으로 값을 받기 
	@GetMapping("/ajax/ex05")	// Ajax를 통한 비동기 통신 
	public @ResponseBody String Ex05Ajax(
			@ModelAttribute AjaxDTO ajaxDTO
			) {
		System.out.println("Ajax Controller : ext05 요청 성공 ");
		System.out.println("param1 : " + ajaxDTO.getParam1());
		System.out.println("param2 : " + ajaxDTO.getParam2());
		
		
		return "ex05 요청 처리 완료됨"; 	// @ResponseBody : 리턴 타입 앞에 할당, JSON 포멧으로 변환후 전송 	
	}
	

}
