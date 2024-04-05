package com.project.movie.announcement;

import java.util.List;


public interface AnnouncementDAO {
	
	
	
	public AnnouncementVO a_selectOne(AnnouncementVO vo);

	public List<AnnouncementVO> a_selectAll(int cpage, int pageBlock);

	public List<AnnouncementVO> a_searchList(String searchKey, String searchWord, int cpage, int pageBlock);

	public int a_getTotalRows();

	public int a_getSearchTotalRows(String searchKey, String searchWord);

}
