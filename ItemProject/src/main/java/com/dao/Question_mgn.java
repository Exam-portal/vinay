package com.dao;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;

@Entity
public class Question_mgn {

	@Id
	@GeneratedValue
	private int Question_Id;
	
	
	@Column(name="courseName")
	private char CourseType;
	
	public void Q_B_Id() {}
	public void Test_Id() {}
	public void Q_Id() {}
	
	public Question_mgn() {}
	
	
	public int getQuestion_Id() {
		return Question_Id;
	}
	public void setQuestion_Id(int question_Id) {
		Question_Id = question_Id;
	}
	public char getCourseType() {
		return CourseType;
	}
	public void setCourseType(char courseType) {
		CourseType = courseType;
	}
	public void setOption(String string) {
		// TODO Auto-generated method stub
		
	}
	public void add(Question_mgn question) {
		// TODO Auto-generated method stub
		
	}
	public Question_mgn find(int question_Id2) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Question> findAllQuestion() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
