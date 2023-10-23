package com.spring.myweb.snsboard.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.spring.myweb.snsboard.entity.SnsBoard;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString @EqualsAndHashCode
public class SnsBoardDetailDTO {
	
	private int bno;
	private String writer;
	private String fileLoca;
	private String fileName;
	private String content;
	private String regDate;
	
	public SnsBoardDetailDTO(SnsBoard board) {
		this.bno = board.getBno();
		this.writer = board.getWriter();
		this.fileLoca = board.getFileLoca();
		this.fileName = board.getFileName();
		this.content = board.getContent();
		this.regDate = makePrettierDateString(board.getRegDate());
	}
	
	String makePrettierDateString(LocalDateTime regDate) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		return dtf.format(regDate);
	}


}