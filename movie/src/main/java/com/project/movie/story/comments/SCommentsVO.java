package com.project.movie.story.comments;
import lombok.Data;
import java.util.Date;



@Data
public class SCommentsVO {
	private int story_comments_num;
	private String nickname;	
	private String content;
	private Date wdate;
	private int good;
	private int story_board_num;
	private String report;
	
	public SCommentsVO() {
		// TODO Auto-generated constructor stub
	}

	public SCommentsVO(int story_comments_num, String nickname, String content, Date wdate, int good,
			int story_board_num, String report) {
		super();
		this.story_comments_num = story_comments_num;
		this.nickname = nickname;
		this.content = content;
		this.wdate = wdate;
		this.good = good;
		this.story_board_num = story_board_num;
		this.report = report;
	}
}
