package org.zerock.board.mapper;

import java.util.List;

import org.zerock.board.vo.BoardVO;

public interface BoardMapper {
	
	// 1. ����Ʈ
	public List<BoardVO> list() throws Exception;
	
}
