package com.wb.sb.board;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardVO {

	private long num;
	private String title;
	private String contents;
	private Date regDate;
	private long hit;
	
}
