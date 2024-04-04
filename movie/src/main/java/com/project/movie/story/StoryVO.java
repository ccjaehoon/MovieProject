package com.project.movie.story;

import java.util.Date;

import lombok.Data;

@Data
public class StoryVO {
	private int story_num;
	private String nickname;	
	private String storycontent;
	private String savename;
	private String file;
	private Date wdate;
	private int good;
	private int views;
	private Date duration; //스토리가 표시되는 시간
	private String report;
	

	

}