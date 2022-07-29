package com.inflearn.service;

import java.util.List;

import com.inflearnVO.QuestionVO;

public interface QuestionService {
	public int insertQuestion(QuestionVO Question);
	public int deleteQuestion(int id);
	public int updateQuestion(QuestionVO Question);
	public QuestionVO getQuestionById(int id);
	public List<QuestionVO> getQuestions();
}
