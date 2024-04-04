package com.project.movie.announcement;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.movie.user.UserDAOimpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class AnnouncementDAOimpl implements AnnouncementDAO {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public AnnouncementVO a_selectOne(AnnouncementVO vo) {
		
		return null;
	}

	@Override
	public List<AnnouncementVO> a_selectAll(int cpage, int pageBlock) {
		
		return null;
	}

	@Override
	public List<AnnouncementVO> a_searchList(String searchKey, String searchWord, int cpage, int pageBlock) {
		
		return null;
	}

	@Override
	public int a_getTotalRows() {
		
		return 0;
	}

	@Override
	public int a_getSearchTotalRows(String searchKey, String searchWord) {
		
		return 0;
	}

}
