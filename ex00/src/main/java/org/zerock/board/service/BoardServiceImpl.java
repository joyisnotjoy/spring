package org.zerock.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.board.dao.BoardDAO;
import org.zerock.board.vo.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class BoardServiceImpl implements BoardService{
	// �ڵ������ϰ� �ϴ� ������̼�
		// @Controller, @Service, @Repository, @Component, @RestController, @Advice
		//WEB-INF/spring/root-context.xml ������ �Ǿ� �־�� �Ѵ�. component-scan
		// DI ���� ��  BoardService Ÿ�� : 1. BoardService �������̽� 2.BoardServiceImpl Ŭ����
		@Setter(onMethod_=@Autowired)
		private BoardDAO dao;
		
	@Override
	public List<BoardVO> list() throws Exception {
		// TODO Auto-generated method stub
		log.info("list() - �Խ��� ����Ʈ ���� ���� *******");
		dao.getTotalRow();
		
		dao.list();
		
		return null;
	}

	@Override
	public BoardVO view() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int write() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
