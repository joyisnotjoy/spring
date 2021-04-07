package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

// spring-text를 이용해서 테스트
@RunWith(SpringJUnit4ClassRunner.class)
//테스트 할 때의 정보 - 생성, 조립, 설정 내용 확인후 테스트 실행
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTests {

	// 필요한 객체를 lombok에 의해 선언
	@Setter(onMethod_= {@Autowired})
	private DataSource dataSource;
	
	// - Mybatis-Spring 사용 : HikariCP 포함.
	@Setter(onMethod_= {@Autowired})
	private SqlSessionFactory sqlSessionFactory;

	// 테스트 할 메소드 만들기 - Mybatis
	@Test
	public void testMybatis() {
		try (SqlSession session = sqlSessionFactory.openSession();
				Connection con = session.getConnection()){
			log.info("Mybatis Test ----------------------------------------");
			log.info(session);
			log.info(con);
		} catch (Exception e) {
			// TODO: handle exception
			fail(e.getMessage());
		}
	}
	// 테스트 할 메소드 만들기 - HikariCP
	@Test
	public void testConnection() {
		try (Connection con = dataSource.getConnection()){
			log.info("HikariCP Test ----------------------------------------");
			log.info(con);
		} catch (Exception e) {
			// TODO: handle exception
			fail(e.getMessage());
		}
	}

}
