package org.zerock.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.board.mapper.BoardMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	// 처리해서 테스트해야 할 객체 - 자동 주입
	@Setter(onMethod_ = {@Autowired})
	private BoardMapper mapper;
	
	// 테스트할 메서드
	@Test
	public void testGetTime() throws Exception {
		log.info("Mapper Test - getTime() ---------------------------");
		log.info(mapper.getClass().getName());
		log.info(mapper.list());
	}
	
}
