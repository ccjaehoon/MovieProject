package com.project.movie.story;

import java.util.Date;
import java.util.List;

public interface StoryService {
	

	public int s_insert(StoryVO vo);

	public int s_update(StoryVO vo);

	public int s_delete(StoryVO vo);
	
	public List<StoryVO> s_selectOne(StoryVO vo);
	
	public List<StoryVO> s_selectAll();
	
	public List<StoryVO> s_selectAll(int cpage,int pageBlock);
	
	public Date s_getLiveStories(StoryVO vo);
	
	public int s_removeExpired();
	


}