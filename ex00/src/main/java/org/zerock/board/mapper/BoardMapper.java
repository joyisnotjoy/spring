package org.zerock.board.mapper;

import java.util.List;

import org.zerock.board.vo.BoardVO;

public interface BoardMapper {
	
	// 1. 리스트
	public List<BoardVO> list() throws Exception;
	
	// 2. 글보기
	// mapper
		public BoardVO view(Long no) throws Exception;
		
	// 3. 글쓰기
	// mapper
	public int write(BoardVO vo) throws Exception;
	
	//4. 글수정 처리
	public int update(BoardVO vo) throws Exception;

	//5. 글삭제 처리
	public int delete(Long no) throws Exception;
}
