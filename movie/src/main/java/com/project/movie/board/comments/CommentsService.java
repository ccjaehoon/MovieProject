package com.project.movie.board.comments;

import java.util.List;

public interface CommentsService {
	
	public int c_insert(CommentsVO vo);

	public int c_update(CommentsVO vo);

	public int c_delete(CommentsVO vo);

	public List<CommentsVO> c_selectAll(int cpage, int pageBlock);

	public int c_increaseGood(CommentsVO vo);
	
	public int c_increaseReport(CommentsVO vo);


}
