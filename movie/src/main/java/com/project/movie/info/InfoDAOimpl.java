package com.project.movie.info;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class InfoDAOimpl implements InfoDAO {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public InfoDAO selectOne(InfoVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InfoDAO> selectAll(int cpage, int pageBlock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InfoDAO> searchList(String searchKey, String searchWord, int cpage, int pageBlock) {
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
	public int increaseRecommends(InfoVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<InfoDAO> sortRecommends(int recommends, int cpage, int pageBlock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InfoDAO> sortDate(Date relaseDate, int cpage, int pageBlock) {
		// TODO Auto-generated method stub
		return null;
	}

}
