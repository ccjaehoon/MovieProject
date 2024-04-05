package com.project.movie.story.comments;

import java.util.Date;

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

	public int getStory_comments_num() {
		return story_comments_num;
	}

	public void setStory_comments_num(int story_comments_num) {
		this.story_comments_num = story_comments_num;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getWdate() {
		return wdate;
	}

	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}

	public int getGood() {
		return good;
	}

	public void setGood(int good) {
		this.good = good;
	}

	public int getStory_board_num() {
		return story_board_num;
	}

	public void setStory_board_num(int story_board_num) {
		this.story_board_num = story_board_num;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + good;
		result = prime * result + ((nickname == null) ? 0 : nickname.hashCode());
		result = prime * result + ((report == null) ? 0 : report.hashCode());
		result = prime * result + story_board_num;
		result = prime * result + story_comments_num;
		result = prime * result + ((wdate == null) ? 0 : wdate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SCommentsVO other = (SCommentsVO) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (good != other.good)
			return false;
		if (nickname == null) {
			if (other.nickname != null)
				return false;
		} else if (!nickname.equals(other.nickname))
			return false;
		if (report == null) {
			if (other.report != null)
				return false;
		} else if (!report.equals(other.report))
			return false;
		if (story_board_num != other.story_board_num)
			return false;
		if (story_comments_num != other.story_comments_num)
			return false;
		if (wdate == null) {
			if (other.wdate != null)
				return false;
		} else if (!wdate.equals(other.wdate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SCommentsVO [story_comments_num=" + story_comments_num + ", nickname=" + nickname + ", content="
				+ content + ", wdate=" + wdate + ", good=" + good + ", story_board_num=" + story_board_num + ", report="
				+ report + "]";
	}
	
	
}
