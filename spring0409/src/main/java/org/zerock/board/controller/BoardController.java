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
	
	private final String MODULE_NAME = "게시판";
	
	@Autowired
	@Qualifier("bsi")
	private BoardService service;
	
	
	//Mapping : get방식
	@GetMapping("/list.do")
	public String list(Model model) throws Exception {

		log.info("list() :" + MODULE_NAME + " list 입니다. -------------------------");
		
		//model에 데이터를 담으면 model 안에 있는 request에 담긴다.
		model.addAttribute("list", service.list());
		
		return MODULE + "/list";
		
	}
	
	@GetMapping("/view.do")
	public String view(Model model, Long no, int inc) throws Exception {

		log.info("view().no : " + MODULE_NAME + " 글 보기 입니다.");
		log.info("view().no : " + no + " 번 글 입니다.");

		if(inc == 1) {
			
			service.increase(no);
			
		}

		model.addAttribute("vo", service.view(no));

		// WEB-INF/views/ + board/view + .jsp : Servlet-context.xml에 설정되어 있다.
		return MODULE + "/view";

	}

	@GetMapping("/write.do")
	public String writeForm() throws Exception {

		log.info("writeForm() : " + MODULE_NAME + " 글 쓰기 폼 입니다.------------------------------------ ");

		return MODULE + "/write";

	}

	@PostMapping("/write.do")
	public String write(BoardVO vo) throws Exception {

		log.info("write() : " + MODULE_NAME + " 글 등록 처리입니다.------------------------------------ ");
		log.info("write() : " + vo + " 글 등록 처리입니다.------------------------------------ ");

		service.write(vo);

		return "redirect:list.do";

	}

	@GetMapping("/update.do")
	public String updateForm(Model model, Long no) throws Exception {

		log.info("updateForm() : " + MODULE_NAME + "글 수정 폼 입니다.------------------------------------------");

		model.addAttribute("vo", service.view(no));
		
		return MODULE + "/update";

	}

	@PostMapping("/update.do")
	public String update(BoardVO vo) throws Exception {

		log.info("update() : " + MODULE_NAME + " 글 수정 처리 입니다. -----------------------------------");
		log.info("update() : " + vo + " 글 수정 처리 입니다. -----------------------------------");

		service.update(vo);
		
		return "redirect:view.do?no=" + vo.getNo() + "&inc=0";

	}

	@GetMapping("/delete.do")
	public String delete(long no) throws Exception {

		log.info("delete() : " + MODULE_NAME + " 글 삭제 처리 입니다.----------------------------------------");
		log.info("delete() : " + no + " 글 삭제 처리 입니다.----------------------------------------");

		service.delete(no);
		
		return "redirect:list.do";

	}
}
