package com.project.movie.info.review;

import java.util.List;

public interface ReviewService {
	
	public int insert(ReviewVO vo);
	
	public int update(ReviewVO vo);
	
	public int delete(ReviewVO vo);
	
	public ReviewVO selectOne(ReviewVO vo);

	public List<ReviewVO> selectAll(int cpage, int pageBlock);

	public int getTotalRows();

	public int getSearchTotalRows(String searchKey, String searchWord);
	
	public ReviewVO increaseGood(ReviewVO vo);
}
