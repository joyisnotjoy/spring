package org.zerock.board.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardVO {

	private long no;
	private String title;
	private String content;
	private String writer;
	private Date writeDate;
	private long hit;
	
}
