package com.project.movie.info.review;

import java.util.Date;

import lombok.Data;

@Data
public class ReviewVO {
	private int movie_num;
	private int review_num;
	private String writer;
	private String nickname;
	private Date wdate;
	private int good;
	private String report;
}
