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

//import lombok.Setter;
import lombok.extern.log4j.Log4j;
 
//�옄�룞 �깮�꽦�븯寃뚰븯�뒗 �뼱�끂�뀒�씠�뀡
//@Controller, @Service, @Repository, @Component, @RestController, @Advice
///WEB-INF/spring/appServlet/servlet-context.xml �꽕�젙�씠 �릺�뼱 �엳�뼱�빞 �븳�떎. component-scan
@Controller
@RequestMapping("/board")
@Log4j
public class BoardController {

	private final String MODULE = "board";
	
	//@Setter - lombok �궗�슜, @Autowired - Spring �궗�슜
	// ���떊 �궗�슜 媛��뒫�븳 �뼱�끂�뀒�씠�뀡 : @Autowired - Spring, @Inject - java
	// DI �쟻�슜 �떆 BoardService ���엯 : 1. BoardService �씤�꽣�럹�씠�뒪 2. BoardServiceImpl �겢�옒�뒪
//	@Setter(onMethod_ = @Autowired , )
	@Autowired
	// BoardService �긽�냽 諛쏆븘�꽌 ���엯�씠 媛숈� 寃껋씠 �엳�쑝硫� �뼱�뼡 寃껋쓣 �꽔�뼱 以꾩� 寃곗젙�씠 �븞�릺�꽌 �삤瑜� - �빐寃�
	@Qualifier("bsi")
	private BoardService service;
	
	// �떎�뻾�븷 硫붿꽌�뱶 - 由ъ뒪�듃
	// 留듯븨 - get 諛⑹떇. list.do
	@GetMapping("/list.do")
	public String list(Model model) throws Exception {
		 
		log.info("list() - 寃뚯떆�뙋 由ъ뒪�듃 --------------");
		
		// model�뿉 �뜲�씠�꽣 �떞�쑝硫� model�븞�뿉 �엳�뒗 request�뿉 �뜲�씠�꽣媛� �떞湲대떎.
		model.addAttribute("list", service.list());
		
		return MODULE + "/list";
	}
	
	// �떎�뻾�븷 硫붿꽌�뱶 - 湲�蹂닿린
	// 留듯븨 - get 諛⑹떇. view.do
	@GetMapping("/view.do")
	public String view(Model model, Long no) throws Exception {
		
		log.info("view().no : "+no+" - 寃뚯떆�뙋 湲�蹂닿린 --------------");
		
		model.addAttribute("vo", service.view(no));
		
		// /WEB-INF/view/ + board/view + .jsp
		return MODULE + "/view";
	}
	
	// �떎�뻾�븷 硫붿꽌�뱶 - 湲��벐湲� �뤌
	// 留듯븨 - get 諛⑹떇. write.do
	@GetMapping("/write.do")
	public String writeForm() {
		
		log.info("writeForm() - 寃뚯떆�뙋 湲��벐湲� �뤌 --------------");
		
		return MODULE + "/write";
	}
	
	// �떎�뻾�븷 硫붿꽌�뱶 - 湲��벐湲� 泥섎━
	// 留듯븨 - post 諛⑹떇. write.do
	@PostMapping("/write.do")
	public String write(BoardVO vo) throws Exception {
		
		log.info("write().vo : " + vo + " - 寃뚯떆�뙋 湲��벐湲� 泥섎━ --------------");
		
		service.write(vo);
		
		return "redirect:list.do";
	}
	
	// �떎�뻾�븷 硫붿꽌�뱶 - 湲��닔�젙 �뤌
	// 留듯븨 - get 諛⑹떇. update.do
	@GetMapping("/update.do")
	public String updateForm(Model model, Long no) throws Exception {
		
		log.info("updateForm() - 寃뚯떆�뙋 湲��닔�젙 �뤌 --------------");
		
		model.addAttribute("vo", service.view(no));
		
		return MODULE + "/update";
	}
	
	// �떎�뻾�븷 硫붿꽌�뱶 - 湲��닔�젙 泥섎━
	// 留듯븨 - post 諛⑹떇. update.do
	@PostMapping("/update.do")
	public String update(BoardVO vo) throws Exception {
		
		log.info("update().vo : " + vo + " - 寃뚯떆�뙋 湲��닔�젙 泥섎━ --------------");
		
		service.update(vo);
		
		return "redirect:view.do?no=" + vo.getNo();
	}
	
	// �떎�뻾�븷 硫붿꽌�뱶 - 湲��궘�젣 泥섎━
	// 留듯븨 - get 諛⑹떇. delete.do
	@GetMapping("/delete.do")
	public String delete(Long no) throws Exception{
		
		log.info("delete().no : " + no + " - 寃뚯떆�뙋 湲��궘�젣 泥섎━ --------------");
		
		service.delete(no);
		
		return "redirect:list.do";
	}
	
}
