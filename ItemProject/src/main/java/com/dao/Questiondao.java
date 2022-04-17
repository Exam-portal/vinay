package com.dao;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;

import com.model.QuestionBank;

public interface Questiondao {
	
	public static void addQuestion(QuestionBank question)
	{
		// TODO Auto-generated method stub
		return;
	}
	public Question findQuestion(int id);
	public static List<Question> findllQuestion() {
		// TODO Auto-generated method stub
		return null;
	}
	public static boolean updateQuestion(Question question) {
		// TODO Auto-generated method stub
		return false;
	}
	public static boolean deleteQuestion(Question question) {
		// TODO Auto-generated method stub
		return false;
	}
	public static com.dao.QuestionBank validateQuestion(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
