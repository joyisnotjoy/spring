package org.zerock.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller // 자동생성과 역할
@RequestMapping("/board")
@Log4j
public class BoardController {
	
	private final String MODULE = "board";
	
	// 1. 게시판 리스트
	@GetMapping("/list.do")
	public String list(Model model) {
		
		log.info("list() - 게시판 리스트 --------------------------");
		
		return MODULE + "/list";
	}
	
	// 2. 게시판 글보기
	// 3-1. 게시판 글쓰기 폼
	// 3-2. 게시판 글쓰기 처리
	// 4. 게시판 글수정 폼
	// 4. 게시판 글수정 처리
	// 5. 게시판 글삭제 처리
	
}
