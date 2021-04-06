package org.zerock.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.board.service.BoardService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board")
@Log4j
public class BoardController {

	private final String MODULE = "board";
	
	// �ڵ������ϰ� �ϴ� ������̼�
	// @Controller, @Service, @Repository, @Component, @RestController, @Advice
	//WEB-INF/spring/root-context.xml ������ �Ǿ� �־�� �Ѵ�. component-scan
	// DI ���� ��  BoardService Ÿ�� : 1. BoardService �������̽� 2.BoardServiceImpl Ŭ����
	@Setter(onMethod_=@Autowired)
	private BoardService service;
	
	// ������ �޼ҵ� - ����Ʈ
	// ���� - get ���. list.do
	@GetMapping("/list.do")
	public String list() throws Exception {
		
		log.info("list() - �Խ��� ����Ʈ ------------------------------");
		
		service.list();
		
		return MODULE + "/list";
	}

	// ������ �޼ҵ� - ����Ʈ
	// ���� - get ���. view.do
	@GetMapping("/view.do")
	public String view() {
		
		log.info("view() - �Խ��� �ۺ��� ------------------------------");
		
		return MODULE + "/view";
	}

	// ������ �޼ҵ� - �۾��� ��
	// ���� - get ���. write.do
	@GetMapping("/write.do")
	public String writeForm() {
		
		log.info("writeForm() - �Խ��� �۾��� �� ------------------------------");
		
		return MODULE + "/write";
	}

	// ������ �޼ҵ� - �۾��� ó��
	// ���� - get ���. write.do
	@PostMapping("/write.do") 
	public String write() {
		
		log.info("write() - �Խ��� �۾��� ó�� ------------------------------");
		
		return "redirect:list.do";
	}
	
	// ������ �޼ҵ� - �ۼ��� ó��
	// ���� - get ���. update.do
	@GetMapping("/update.do")
	public String updateForm() {
		
		log.info("updateForm() - �Խ��� �ۼ��� �� ó�� ------------------------------");
		
		return MODULE + "/update";
	}
	
	// ������ �޼ҵ� - �ۼ��� ó��
	// ���� - get ���. update.do
	@PostMapping("/update.do")
	public String update() {
		
		log.info("update() - �Խ��� �ۼ��� ó�� ------------------------------");
		
		return "redirect:view.do";
	}
	
	// ������ �޼ҵ� - �ۼ��� ó��
	// ���� - get ���. update.do
	@GetMapping("/delete.do")
	public String delete() {
		
		log.info("delete() - �Խ��� �ۻ��� ó�� ------------------------------");
		
		return "redirect:list.do";
	}
	
}
