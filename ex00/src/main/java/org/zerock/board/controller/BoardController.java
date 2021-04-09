package org.zerock.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.board.service.BoardService;
import org.zerock.board.vo.BoardVO;

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
//	@Setter(onMethod_=@Autowired)
	@Autowired
	@Qualifier("bsi")
	private BoardService service;
	
	// ������ �޼ҵ� - ����Ʈ
	// ���� - get ���. list.do
	@GetMapping("/list.do")
	public String list(Model model) throws Exception {
		
		log.info("list() - �Խ��� ����Ʈ ------------------------------");
		
		// model�� ������ ������ model�ȿ� �ִ� request�� �����Ͱ� ����.
		model.addAttribute("list",service.list());
		
		return MODULE + "/list";
	}

	// ������ �޼ҵ� - ����Ʈ
	// ���� - get ���. view.do
	@GetMapping("/view.do")
	public String view(Model model, Long no) throws Exception {
		
		log.info("view().no : " + no + " - �Խ��� �ۺ��� ------------------------------");
		model.addAttribute("vo",service.view(no));
		
		// /WEB-INF/view/ + board/view + .jsp
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
	public String write(BoardVO vo) throws Exception{
		
		log.info("write().vo: " + vo + " - �Խ��� �۾��� ó�� ------------------------------");
		service.write(vo);
		return "redirect:list.do";
	}
	
	// ������ �޼ҵ� - �ۼ��� ó��
	// ���� - get ���. update.do
	@GetMapping("/update.do")
	public String updateForm(Model model, Long no) throws Exception{
		
		log.info("updateForm() - �Խ��� �ۼ��� �� ó�� ------------------------------");
		
		model.addAttribute("vo", service.view(no));
		
		return MODULE + "/update";
	}
	
	// ������ �޼ҵ� - �ۼ��� ó��
	// ���� - get ���. update.do
	@PostMapping("/update.do")
	public String update(BoardVO vo) throws Exception{
		
		log.info("update().vo: " + vo + " - �Խ��� �ۼ��� ó�� ------------------------------");
		
		service.update(vo);
		
		return "redirect:view.do?no=" + vo.getNo();
	}
	
	// ������ �޼ҵ� - �ۼ��� ó��
	// ���� - get ���. update.do
	@GetMapping("/delete.do")
	public String delete(Long no) throws Exception {
		
		log.info("delete().no :" + no + " - �Խ��� �ۻ��� ó�� ------------------------------");
		
		service.delete(no);
		
		return "redirect:list.do";
	}
	
}
