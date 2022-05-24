package org.study.sample.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class ReplyDTO {
	
	private int r_no;
	private String r_boardNum;
	private String r_writer;
	private String r_content;
	private Timestamp r_regDate;
	
}
