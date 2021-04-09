package org.zerock.board.service;

import java.util.List;

import org.zerock.board.vo.BoardVO;

public interface BoardService {

	// 1. ����Ʈ
	public List<BoardVO> list() throws Exception;
	
	// 2. �ۺ���
	public BoardVO view(Long no) throws Exception;
	
	// 3. �۾���
	public int write(BoardVO vo) throws Exception;
	
	// 4. �ۼ���
	public int update(BoardVO vo) throws Exception;
	
	// 5. �ۻ���
	public int delete(Long no) throws Exception;
	
}
