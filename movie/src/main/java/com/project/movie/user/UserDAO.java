package com.project.movie.user;

import java.util.List;


public interface UserDAO {
	
	public int u_insert(UserVO vo);

	public int u_update(UserVO vo);

	public int u_delete(UserVO vo);

	public UserVO u_selectOne(UserVO vo);

	public UserVO u_login(UserVO vo);

	public List<UserVO> u_selectAll(int cpage, int pageBlock);

	public List<UserVO> u_searchList(String searchKey, String searchWord, int cpage, int pageBlock);

	public int u_getTotalRows();

	public int u_getSearchTotalRows(String searchKey, String searchWord);

	public UserVO idCheck(UserVO vo);
	
	public UserVO nicknameCheck(UserVO vo);
	
	public UserVO emailCheck(UserVO vo);
}
