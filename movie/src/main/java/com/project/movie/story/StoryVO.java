package com.project.movie.story;

import lombok.Data;
import java.util.Date;
@Data
public class StoryVO {
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
	
	public StoryVO() {
		// TODO Auto-generated constructor stub
	}

	public StoryVO(int story_num, String nickname, String storycontent, String savename,  String image_file, String video_file, Date wdate,
			int good, int views, Date duration, String report) {
		super();
		this.story_num = story_num;
		this.nickname = nickname;
		this.storycontent = storycontent;
		this.savename = savename;
		this.image_file = image_file;
		this.video_file = video_file;
		this.wdate = wdate;
		this.good = good;
		this.views = views;
		this.duration = duration;
		this.report = report;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + good;
		result = prime * result + ((image_file == null) ? 0 : image_file.hashCode());
		result = prime * result + ((nickname == null) ? 0 : nickname.hashCode());
		result = prime * result + ((report == null) ? 0 : report.hashCode());
		result = prime * result + ((savename == null) ? 0 : savename.hashCode());
		result = prime * result + story_num;
		result = prime * result + ((storycontent == null) ? 0 : storycontent.hashCode());
		result = prime * result + ((video_file == null) ? 0 : video_file.hashCode());
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
		if (good != other.good)
			return false;
		if (image_file == null) {
			if (other.image_file != null)
				return false;
		} else if (!image_file.equals(other.image_file))
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
		if (video_file == null) {
			if (other.video_file != null)
				return false;
		} else if (!video_file.equals(other.video_file))
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
				+ ", savename=" + savename + ", image_file=" + image_file + ", video_file=" + video_file + ", wdate="
				+ wdate + ", good=" + good + ", views=" + views + ", duration=" + duration + ", report=" + report + "]";
	}
	
}
