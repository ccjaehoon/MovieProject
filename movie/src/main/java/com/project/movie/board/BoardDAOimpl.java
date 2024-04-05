package com.project.movie.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class BoardDAOimpl implements BoardDAO {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int b_insert(BoardVO vo) {
		log.info("b_insert()...");
		
		int flag = sqlSession.insert("INSERT", vo);
		
		return flag;
	}

	@Override
	public int b_update(BoardVO vo) {
		log.info("b_update()...");
		
		int flag = sqlSession.update("UPDATE", vo);
		
		return flag;
	}

	@Override
	public int b_delete(BoardVO vo) {
		log.info("b_delete()....");

		int flag = sqlSession.delete("DELETE", vo);

		return flag;
	}

	@Override
	public BoardVO b_selectOne(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> b_selectAll(int cpage, int pageBlock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> b_searchList(String searchKey, String searchWord, int cpage, int pageBlock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int b_getTotalRows() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int b_getSearchTotalRows(String searchKey, String searchWord) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int b_increaseGood(BoardVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}


}
