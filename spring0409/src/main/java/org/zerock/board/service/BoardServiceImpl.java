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
@Qualifier("bsi")
public class BoardServiceImpl implements BoardService{
	
	@Setter(onMethod_ = {@Autowired})
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> list() throws Exception{
		
		log.info("list() - 게시판 리스트 Service +++++++++++++++++++++++++++");
		
		return mapper.list();
	}
	@Override
	public BoardVO view(Long no) throws Exception {
		// TODO Auto-generated method stub

		log.info("view() - 게시판 글 보기 Service ++++++++++++++++++++++++++++++");

		return mapper.view(no);
	}

	@Override
	public int write(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub

		log.info("write------------------");

		return mapper.write(vo);
	}

	@Override
	public int update(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		
		log.info("update ----------------------------------------");
		
		return mapper.update(vo);
	}

	@Override
	public int delete(long no) throws Exception {
		// TODO Auto-generated method stub
		
		log.info("delete --------------------------------------------------------------");
		
		return mapper.delete(no);
	}

	@Override
	public int increase(Long no) throws Exception {
		// TODO Auto-generated method stub

		log.info("조회수 1 증가 +++++++++++++++++++++++++++++++++++++++++++");

		return mapper.increase(no);
	}

}
