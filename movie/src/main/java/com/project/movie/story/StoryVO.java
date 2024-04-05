package com.project.movie.story;

import java.util.Date;

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
	
	public StoryVO() {
		// TODO Auto-generated constructor stub
	}

	public StoryVO(int story_num, String nickname, String storycontent, String savename, String file, Date wdate,
			int good, int views, Date duration, String report) {
		super();
		this.story_num = story_num;
		this.nickname = nickname;
		this.storycontent = storycontent;
		this.savename = savename;
		this.file = file;
		this.wdate = wdate;
		this.good = good;
		this.views = views;
		this.duration = duration;
		this.report = report;
	}

	public int getStory_num() {
		return story_num;
	}

	public void setStory_num(int story_num) {
		this.story_num = story_num;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getStorycontent() {
		return storycontent;
	}

	public void setStorycontent(String storycontent) {
		this.storycontent = storycontent;
	}

	public String getSavename() {
		return savename;
	}

	public void setSavename(String savename) {
		this.savename = savename;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
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

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
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
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((file == null) ? 0 : file.hashCode());
		result = prime * result + good;
		result = prime * result + ((nickname == null) ? 0 : nickname.hashCode());
		result = prime * result + ((report == null) ? 0 : report.hashCode());
		result = prime * result + ((savename == null) ? 0 : savename.hashCode());
		result = prime * result + story_num;
		result = prime * result + ((storycontent == null) ? 0 : storycontent.hashCode());
		result = prime * result + views;
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
		StoryVO other = (StoryVO) obj;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (file == null) {
			if (other.file != null)
				return false;
		} else if (!file.equals(other.file))
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
		if (savename == null) {
			if (other.savename != null)
				return false;
		} else if (!savename.equals(other.savename))
			return false;
		if (story_num != other.story_num)
			return false;
		if (storycontent == null) {
			if (other.storycontent != null)
				return false;
		} else if (!storycontent.equals(other.storycontent))
			return false;
		if (views != other.views)
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
		return "StoryVO [story_num=" + story_num + ", nickname=" + nickname + ", storycontent=" + storycontent
				+ ", savename=" + savename + ", file=" + file + ", wdate=" + wdate + ", good=" + good + ", views="
				+ views + ", duration=" + duration + ", report=" + report + "]";
	}
	

}
