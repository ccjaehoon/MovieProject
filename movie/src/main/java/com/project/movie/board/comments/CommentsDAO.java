package com.project.movie.board.comments;

import java.util.List;

public interface CommentsDAO {
	
	public int c_insert(CommentsVO vo);

	public int c_update(CommentsVO vo);

	public int c_delete(CommentsVO vo);

	public List<CommentsVO> c_selectAll(int cpage, int pageBlock);

	public int c_getTotalRows();

	public int c_increaseGood(CommentsVO vo);

}
