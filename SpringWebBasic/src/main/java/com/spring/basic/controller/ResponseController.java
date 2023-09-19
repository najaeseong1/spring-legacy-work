package com.spring.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.basic.model.UserVO;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/response")
public class ResponseController {
	
	@GetMapping("/res-ex01")
	public void resEx01() {
		System.out.println("/response/res-ex01 요청이 들어옴");
	}
	/*
	1. Model 객체를 사용하여 응답할 화면에 데이터를 전송하기
	스프링에서 제공하는 Model 타입의 객체를 활용하여 Jsp 파일과 같은 View 템플릿으로 데이터를 전송할 수 있습니다.
	Model 객체는 기본적으로 Request 객체의 attribute로 설정되어 전송되므로, 
	기존에 알고 계시던 forward 방식의 응답을 생각하시면 됩니다.
	*/
	
	/*
	@GetMapping("/test") // response/test.jsp 로 맵핑 되어 있음
//	public void test(@RequestParam("age")생략되어있음(age 변수가 같아서)
	public void test( int age, Model model) {
		model.addAttribute("age", age);
		model.addAttribute("nick", "멍멍이");
	}
	*/
	
//	2.@ModelAttribute를 사용한 화면에 데이터 전송 처리
//	@RequestParam + model.addAttribute 처럼 동작
	@GetMapping("/test")
	public void test(@ModelAttribute("age")int age,Model model) {
//		model.addAttribute("age", age); 할 필요 없음
		model.addAttribute("nick", "짹짹이");
	}
	
	@GetMapping("/test2")
	public void test2(@ModelAttribute("info") UserVO vo) {
		System.out.println("메서드 내의 콘솔 출력: " + vo);
	}
	
	//3.ModelAndView 객체를 활용한 처리
	//데이터를 view 템플릿으로 전달하는 model의 역할과,
	//사용자에게 응답하고자 하는 페이지를 지정하는 역할을 동시에 진행할 수 있따.
	@GetMapping("/test3")
	public ModelAndView test3() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("userName","김철수");
		mv.addObject("userAge",25);
		mv.setViewName("/response/test3");
		return mv;
	}
	
}