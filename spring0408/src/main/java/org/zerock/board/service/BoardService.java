package org.zerock.board.service;

import java.util.List;

import org.zerock.board.vo.BoardVO;

public interface BoardService {

	//1. ����Ʈ
	public List<BoardVO> list() throws Exception;
}
