package com.inflearnDAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inflearnVO.QuestionVO;

@Repository
public class QuestionDAO {
	@Autowired
	private SqlSession sqlSession;
	
	public int insert(QuestionVO Question) {
	    int result = sqlSession.insert("Question.insertQuestion", Question);    
		return result;
	}
	public int update(QuestionVO Question) {
		int result = sqlSession.update("Question.updateQuestion", Question);
		return result;
	}
	public int delete(int id) {
		int result = sqlSession.delete("Question.deleteQuestion", id);
		return result;
	}
	public QuestionVO getQuestionById(int id) {
		QuestionVO question = sqlSession.selectOne("Question.selectOneQuestion", id);
		return question;
	}
	public List<QuestionVO> getQuestions(){    
		List<QuestionVO> list = sqlSession.selectList("Question.selectListQuestion");
		return list;
	}    
}
