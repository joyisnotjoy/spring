package org.zerock.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller // �ڵ������� ����
@RequestMapping("/board")
@Log4j
public class BoardController {
	
	private final String MODULE = "board";
	
	// 1. �Խ��� ����Ʈ
	@GetMapping("/list.do")
	public String list(Model model) {
		
		log.info("list() - �Խ��� ����Ʈ --------------------------");
		
		return MODULE + "/list";
	}
	
	// 2. �Խ��� �ۺ���
	// 3-1. �Խ��� �۾��� ��
	// 3-2. �Խ��� �۾��� ó��
	// 4. �Խ��� �ۼ��� ��
	// 4. �Խ��� �ۼ��� ó��
	// 5. �Խ��� �ۻ��� ó��
	
}
