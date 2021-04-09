package org.zerock.controller;

import org.zerock.board.vo.BoardVO;

public class DataMain {

	public static void main(String[] args) {
		
		BoardVO vo = new BoardVO();
		vo.setNo(10L);
		
		System.out.println(vo);
	}
}
