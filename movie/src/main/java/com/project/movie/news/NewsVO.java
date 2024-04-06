package com.project.movie.news;

import java.util.Date;

import lombok.Data;

@Data
public class NewsVO {
	private int news_num;
	private String title;
	private String nickname;
	private String content;
	private Date wdate;
	private int view;
	private String save_name;
}
