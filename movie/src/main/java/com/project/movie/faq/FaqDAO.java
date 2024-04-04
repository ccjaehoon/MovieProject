package com.project.movie.faq;

import java.util.List;

public interface FaqDAO {
	
	public int f_selectOne(FaqVO vo);
	
	public List<FaqVO> f_selectAll(int cpage,int pageBlock);
	
	public List<FaqVO> f_searchList(String searchKey, String searchWord,int cpage,int pageBlock);

	public int f_getSearchTotalRows(String searchKey, String searchWord);

}
