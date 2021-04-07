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

// spring-text�� �̿��ؼ� �׽�Ʈ
@RunWith(SpringJUnit4ClassRunner.class)
//�׽�Ʈ �� ���� ���� - ����, ����, ���� ���� Ȯ���� �׽�Ʈ ����
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTests {

	// �ʿ��� ��ü�� lombok�� ���� ����
	@Setter(onMethod_= {@Autowired})
	private DataSource dataSource;
	
	// - Mybatis-Spring ��� : HikariCP ����.
	@Setter(onMethod_= {@Autowired})
	private SqlSessionFactory sqlSessionFactory;

	// �׽�Ʈ �� �޼ҵ� ����� - Mybatis
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
	// �׽�Ʈ �� �޼ҵ� ����� - HikariCP
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
