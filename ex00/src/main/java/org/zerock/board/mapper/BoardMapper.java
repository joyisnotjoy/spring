package org.zerock.board.mapper;

import java.util.List;

import org.zerock.board.vo.BoardVO;

public interface BoardMapper {
	
	// 1. ����Ʈ
	public List<BoardVO> list() throws Exception;
	
	// 2. �ۺ���
	// mapper
		public BoardVO view(Long no) throws Exception;
		
	// 3. �۾���
	// mapper
	public int write(BoardVO vo) throws Exception;
	
	//4. �ۼ��� ó��
	public int update(BoardVO vo) throws Exception;

	//5. �ۻ��� ó��
	public int delete(Long no) throws Exception;
}
