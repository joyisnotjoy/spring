package org.zerock.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.zerock.board.mapper.BoardMapper;
import org.zerock.board.vo.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
// BoardService ��� �޾Ƽ� Ÿ���� ���� ���� ������ � ���� �־� ���� ������ �ȵǾ ���� - �ذ�
@Qualifier("bsi")
public class BoardServiceImpl implements BoardService{
	// �ڵ������ϰ� �ϴ� ������̼�
		// @Controller, @Service, @Repository, @Component, @RestController, @Advice
		//WEB-INF/spring/root-context.xml ������ �Ǿ� �־�� �Ѵ�. component-scan
		// DI ���� ��  BoardService Ÿ�� : 1. BoardService �������̽� 2.BoardServiceImpl Ŭ����
		@Setter(onMethod_=@Autowired)
//		private BoardDAO dao;
		private BoardMapper mapper;
	@Override
	public List<BoardVO> list() throws Exception {
		// TODO Auto-generated method stub
		log.info("list() - �Խ��� ����Ʈ ���� ���� *******");
//		dao.getTotalRow();
//		
//		dao.list();
		
		return mapper.list();
	}

	@Override
	public BoardVO view(Long no) throws Exception {
		// TODO Auto-generated method stub
		log.info("view() - �Խ��� �ۺ��� ���� ���� *******");
		
		return mapper.view(no);
	}

	@Override
	public int write(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		log.info("write() - �Խ��� �۾��� ���� ���� *******");
		return mapper.write(vo);
	}

	@Override
	public int update(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		log.info("update() - �Խ��� �ۼ��� ���� ���� *******");
		return mapper.update(vo);
	}

	@Override
	public int delete(Long no) throws Exception {
		// TODO Auto-generated method stub
		return mapper.delete(no);
	}

}
