package com.project.movie.announcement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.movie.user.UserDAOimpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class AnnouncementServiceimpl implements AnnouncementService {

	@Autowired
	private AnnouncementDAO dao;
	
	@Override
	public AnnouncementVO a_selectOne(AnnouncementVO vo) {
		
		return dao.a_selectOne(vo);
	}

	@Override
	public List<AnnouncementVO> a_selectAll(int cpage, int pageBlock) {
		
		return dao.a_selectAll(cpage, pageBlock);
	}

	@Override
	public List<AnnouncementVO> a_searchList(String searchKey, String searchWord, int cpage, int pageBlock) {
		
		return dao.a_searchList(searchKey, searchWord, cpage, pageBlock);
	}

	@Override
	public int a_getTotalRows() {
		
		return dao.a_getTotalRows();
	}

	@Override
	public int a_getSearchTotalRows(String searchKey, String searchWord) {
		
		return dao.a_getSearchTotalRows(searchKey, searchWord);
	}

}
