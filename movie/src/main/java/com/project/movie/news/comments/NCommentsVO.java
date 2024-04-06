package com.project.movie.news.comments;

import java.util.Date;

import lombok.Data;

@Data
public class NCommentsVO {
	//수정
	private int news_comments_num;
	private String nickname;
	private String content;
	private Date wdate;
	private int good;
	private int news_num;
	private int report;
}
