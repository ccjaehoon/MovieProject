package com.project.movie.story;

import lombok.Data;
import java.util.Date;
@Data
public class StoryVO {
	//getter setter 수정
	private int story_num;
	private String nickname;	
	private String storycontent;
	private String savename;
	private String image_file;
	private String video_file;
	private Date wdate;
	private int good;
	private int views;
	private Date duration; //스토리가 표시되는 시간
	private String report;
	
}
