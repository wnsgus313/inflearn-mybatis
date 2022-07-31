package com.inflearn.service;

import java.util.List;
import java.util.Map;

import com.inflearnVO.UserVO;

public interface UserService {
	public int insertUser(UserVO User);
	public int deleteUser(int id);
	public int updateUser(UserVO User);
	public UserVO getUserById(int id);
	public UserVO getUserByInfo(Map<String, Object> info);
	public List<UserVO> getUsers();
}
