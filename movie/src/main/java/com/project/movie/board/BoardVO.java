package com.project.movie.board;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardVO {

	private int board_num;
	private String title;
	private String tag;
	private String nickname;
	private String content;
	private Date wdate;
	private int good;
	private String authority;
	private int views;
	private int commentscount;
	private String report;

}
