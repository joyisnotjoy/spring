package org.zerock.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {

	//static ��� - static ���� �ʱ�ȭ �� ��/ ó�� ������ �ؾ� �� ��(�� ���� ����).
	static {
		try {
			// 1. ����̹� Ȯ�� 2. static���� ���ǵǾ� �ִ� ��ҵ��� �޸𸮷� �����Ѵ�.
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// static ����� ��
	
	// ����Ŭ DB�� ������ �Ǵ��� Ȯ�� - Connection�� Ȯ��
	@Test
	public void testConnection() {
		// try(try�ȿ����� ����� ��ü ���� - try������ ������ �ڵ� close()){ ó���� }
		try(Connection con = 
				DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe", "java00", "java00")) {
			log.info(con);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
