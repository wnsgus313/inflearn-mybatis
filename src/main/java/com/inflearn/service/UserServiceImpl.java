package com.inflearn.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inflearnDAO.UserDAO;
import com.inflearnVO.UserVO;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDAO dao;

	@Override
	public int insertUser(UserVO User) {
		return dao.insert(User);
	}

	@Override
	public int deleteUser(int id) {
		return dao.delete(id);
	}

	@Override
	public int updateUser(UserVO User) {
		return dao.update(User);
	}

	@Override
	public UserVO getUserById(int id) {
		return dao.getUserById(id);
	}
	
	@Override
	public UserVO getUserByInfo(Map<String, Object> info) {
		return dao.getUserByInfo(info);
	}

	@Override
	public List<UserVO> getUsers() {
		return dao.getUsers();
	}
}
