package com.inflearnDAO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inflearnVO.UserVO;

@Repository
public class UserDAO {
	@Autowired
	private SqlSession sqlSession;
	
	public int insert(UserVO User) {
	    int result = sqlSession.insert("User.insertUser", User);    
		return result;
	}
	public int update(UserVO User) {
		int result = sqlSession.update("User.updateUser", User);
		return result;
	}
	public int delete(int id) {
		int result = sqlSession.delete("User.deleteUser", id);
		return result;
	}
	public UserVO getUserById(int id) {
		UserVO User = sqlSession.selectOne("User.selectUserById", id);
		return User;
	}
	public UserVO getUserByInfo(Map<String, Object> info) {
		UserVO User = sqlSession.selectOne("User.selectUserByInfo", info);
		return User;
	}
	public List<UserVO> getUsers(){    
		List<UserVO> list = sqlSession.selectList("User.selectListUser");
		return list;
	}    
	
}
