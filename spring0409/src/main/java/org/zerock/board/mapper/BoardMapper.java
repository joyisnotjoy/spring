package org.zerock.board.mapper;

import java.util.List;

import org.zerock.board.vo.BoardVO;

public interface BoardMapper {

	//1.list
	public List<BoardVO> list() throws Exception;
	
	// 1-1 전체 데이터 개수 가져오기
	public long getTotalRow() throws Exception;
	
	// 2. view : method 이름은 mapper.xml의 id이름과 맞춰준다.
	public BoardVO view(Long no) throws Exception;
	
	// 2-1 조회수 1 증가
	public int increase(Long no) throws Exception;
	
	// 3. write
	public int write(BoardVO vo) throws Exception;
	
	// 4. update
	public int update(BoardVO vo) throws Exception;
	
	// 5. delete
	public int delete(long no) throws Exception;

}
