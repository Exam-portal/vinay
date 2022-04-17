package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

@SuppressWarnings("unused")
@Component 
public class QuestionBank {
	
	SessionFactory sessionFactory;
	public void addQuestion(Question quetion) {
	
	Session session=sessionFactory.openSession();
	session.getTransaction().begin();
	session.save(findQuestion(0));
	session.flush();
	session.getTransaction().commit();
	session.close();
	}
@SuppressWarnings({ "null" })
public Question findQuestion(int id) {
	Session sesssion=sessionFactory.openSession();
	EntityManager session = null;
	Question question=session.find(Question.class, id);
	return question;
}
@SuppressWarnings("unchecked")
public void findAllQuestion() {
	Session session=sessionFactory.openSession();
	List<Question> questionlist=session.createQuery("select q from Question q").list();
	return;
}
public boolean updateQuestion(Question question) {
	Session session=sessionFactory.openSession();
	session.getTransaction().begin();
	session.update(question);
	session.flush();
	session.getTransaction().commit();
	session.close();
	return true;
	
}
	public boolean deleteQuestion(Question question) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.delete(question);
		session.flush();
		session.getTransaction();
		session.close();
		return true;
		
	}
	
	

}
