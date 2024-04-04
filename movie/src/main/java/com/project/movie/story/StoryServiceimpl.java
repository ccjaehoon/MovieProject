package com.project.movie.story;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoryServiceimpl implements StoryService {

	@Override
	public int s_insert(StoryVO vo) {
		System.out.println("s_insert()....");
		System.out.println(vo);
		int flag = 0;
		
		
		return flag;
	}

	@Override
	public int s_update(StoryVO vo) {
		System.out.println("s_update()....");
		System.out.println(vo);
		
		int flag = 0;
		
		
		return flag;
	}

	@Override
	public int s_delete(StoryVO vo) {
		System.out.println("s_delete()....");
		System.out.println(vo);
		int flag = 0;
		
		
		return flag;
	}
	
	@Override
	public List<StoryVO> s_selectOne(StoryVO vo) {
		System.out.println("selectOne_Story(page)....");
		System.out.println(vo);
		List<StoryVO> vo2 = new ArrayList<StoryVO>();
		
		
		return vo2;
	}

	@Override
	public List<StoryVO> s_selectAll() {
		System.out.println("s_selectAll_Story()...");
		List<StoryVO> vos = new ArrayList<StoryVO>();
		
		
		return vos;
	}

	@Override
	public List<StoryVO> s_selectAll(int cpage, int pageBlock) {
		System.out.println("s_selectAll_Story(page)....");
		System.out.println("cpage:" + cpage);
		System.out.println("pageBlock:" + pageBlock);
		List<StoryVO> vos = new ArrayList<StoryVO>();
		
		return vos;
	}

	@Override
	public Date s_getLiveStories(StoryVO vo) {
		System.out.println("s_getLiveStories....");
		
		
		return new Date();
	}

	@Override
	public int s_removeExpired() {
		System.out.println("s_removeExpired....");
		
		
		return 0;
	}
	
}
