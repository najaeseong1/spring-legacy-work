package com.spring.basic.score.service;

import org.springframework.stereotype.Service;

import com.spring.basic.score.dto.ScoreRequestDTO;

// 컨트롤러와 레파지토리 사이에 배치되어 기타 비지니스 로직 처리
// ex) 값을 가공, 예외 처리, dto로 변환, 트랜잭션 등등...
@Service // 빈 등록 (컨트롤러 등록이랑 똑같)
public class ScoreService {
	// 컨트롤러에서 ScoreRequestDTO를 전달 받았다.
	// 등록 중간처리
	public void insertScore(ScoreRequestDTO dto) {
		
	}
}
