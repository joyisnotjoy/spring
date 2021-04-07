package org.zerock.board.mapper;

import java.util.List;

import org.zerock.board.vo.BoardVO;

public interface BoardMapper {
	
	// 1. ¸®½ºÆ®
	public List<BoardVO> list() throws Exception;
	
}
