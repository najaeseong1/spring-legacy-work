package com.spring.basic.score.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.basic.score.dto.ScoreRequestDTO;
import com.spring.basic.score.service.ScoreService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/score")
@RequiredArgsConstructor // :final 필드가 존재한다면 그것만을 초기화 해주는 생성자.
public class ScoreController {
	
	
	private final ScoreService service;
	
	// 만약에 클래스의 생성자가 단 1개라면
	// 자동으로 @Autowired를 작성해 줌.
	
//	@Autowired
//	public ScoreController(ScoreService scoreService) {
//		service = scoreService;
//	}
	
	//1. 성적 등록화면 띄우기 + 정보 목록 조회
	@GetMapping("/list")
	public String list() {
		System.out.println("/score/list 요청");
		return "score/score-list";
	}
	
	//2. 성적 정보 등록 처리 요청.
	@PostMapping("/register")
	public String register(ScoreRequestDTO dto) {
		System.out.println("/score/register: POST - " + dto);
		
		// 서비스에게 들어온 요청==사용자의 정보(dto)를 데이터베이스에 저장하고 평균과 함계를 계산해서 넣어달라
		// 서비스 객체의 insertScore를 호출해야 한다
		service.insertScore(dto);
		
		return null;
	}
}
