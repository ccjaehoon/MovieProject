package com.project.movie.info;

import java.util.Date;
import java.util.List;

public interface InfoService {
	
	public InfoDAO selectOne(InfoVO vo);
	public List<InfoDAO> selectAll(int cpage, int pageBlock);
	public List<InfoDAO> searchList(String searchKey, String searchWord, int cpage, int pageBlock);
	public int getTotalRows();
	public int getSearchTotalRows(String searchKey, String searchWord);
	public int increaseRecommends(InfoVO vo);
	
	public List<InfoDAO> sortRecommends(int recommends, int cpage, int pageBlock);
	public List<InfoDAO> sortDate(Date relaseDate, int cpage, int pageBlock);

}
