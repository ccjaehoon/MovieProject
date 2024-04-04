package com.project.movie.info.review;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class ReviewDAOimpl implements ReviewDAO {
	
	@Autowired
	private SqlSession sqlSession;


	@Override
	public int insert(ReviewVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(ReviewVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(ReviewVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ReviewVO selectOne(ReviewVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReviewVO> selectAll(int cpage, int pageBlock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalRows() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSearchTotalRows(String searchKey, String searchWord) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ReviewVO increaseGood(ReviewVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
