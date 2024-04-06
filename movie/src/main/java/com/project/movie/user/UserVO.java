package com.project.movie.user;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class UserVO {
	
	private int user_num;
	private String user_id;
	private String password;
	private String nickname;
	private String authority;
	private String gender;
	private Date birth;
	private String tel;
	private String favorite;
	private String email;
	private Date reg_date;
	

}
