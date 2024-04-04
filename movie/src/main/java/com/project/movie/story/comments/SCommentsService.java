package com.project.movie.story.comments;

import java.util.Date;
import java.util.List;

public interface SCommentsService {
	
	public int sc_insert(SCommentsVO vo);

	public int sc_update(SCommentsVO vo);

	public int sc_delete(SCommentsVO vo);
	
	public List<SCommentsVO> sc_selectAll();
	
	public List<SCommentsVO> sc_selectAll(int cpage,int pageBlock);
	
	public int sc_getTotalRows();
	
	Date sc_getLiveStories(SCommentsVO vo);
	
	public int sc_removeExpired();
}
