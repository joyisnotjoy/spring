package org.zerock.board.service;

import java.util.List;

import org.zerock.board.vo.BoardVO;

public interface BoardService {

	//1. ¸®½ºÆ®
	public List<BoardVO> list() throws Exception;
}
