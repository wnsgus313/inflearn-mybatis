package com.inflearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inflearnDAO.QuestionDAO;
import com.inflearnVO.QuestionVO;

@Service
public class QuestionServiceImpl implements QuestionService{
	@Autowired
	QuestionDAO dao;

	@Override
	public int insertQuestion(QuestionVO Question) {
		return dao.insert(Question);
	}

	@Override
	public int deleteQuestion(int id) {
		return dao.delete(id);
	}

	@Override
	public int updateQuestion(QuestionVO Question) {
		return dao.update(Question);
	}

	@Override
	public QuestionVO getQuestionById(int id) {
		return dao.getQuestionById(id);
	}

	@Override
	public List<QuestionVO> getQuestions() {
		return dao.getQuestions();
	}
}
