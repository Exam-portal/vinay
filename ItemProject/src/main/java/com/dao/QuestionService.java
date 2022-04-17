package com.dao;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;

import com.model.QuestionBank;

public interface QuestionService {
	
	public static void addQuestion(QuestionBank question) {
	QuestionService.addQuestion(question);
}
	public static QuestionBank validateQuestion(int id) {
		return (QuestionBank) QuestionService.validateQuestion(id);
	}
	
	public static List<Question> findAllQuestion (int questionId){
		return QuestionService.findAllQuestion( questionId);
	}
	public static  boolean updateQuestion(Question question) {
		return QuestionService.updateQuestion(question);
	}
	public static Object findAllQuestion() {
		// TODO Auto-generated method stub
		return null;
	}
	public static  boolean deleteQuestion(Question question) {
		return QuestionService.deleteQuestion(question);
	}
	public List<Question> findAllQuestions(int questionId);
	public void add(Question question);
	public List<Question> findAllQuestions1(int questionId);
	

}
			
	

