package org.zerock.board.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.zerock.board.vo.BoardVO;

import lombok.extern.log4j.Log4j;

@Repository
@Log4j
public class BoardDAOImpl implements BoardDAO {

	@Override
	public List<BoardVO> list() throws Exception {
		// TODO Auto-generated method stub
		log.info("list() - �Խ��� ����Ʈ ������ �������� +++++++++++++++++++++++++++");
		return null;
	}

	@Override
	public Long getTotalRow() throws Exception {
		// TODO Auto-generated method stub
		log.info("getTotalRow() - �Խ��� ��ü ������ ���� �������� +++++++++++++++++++++++++++");
		return null;
	}

	@Override
	public BoardVO view() throws Exception {
		// TODO Auto-generated method stub
		log.info("view() - �Խ��� �ۺ��� �������� +++++++++++++++++++++++++++");
		return null;
	}

	@Override
	public int increase() throws Exception {
		// TODO Auto-generated method stub
		return 0;
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
