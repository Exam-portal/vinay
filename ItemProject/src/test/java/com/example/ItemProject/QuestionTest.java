package com.example.ItemProject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.Question_mgn;

import junit.framework.Assert;
@SpringBootTest
class QuestionTest {
	@Autowired
	Question_mgn mgn;

	@Test
	void testAddQuestion() {
		Question_mgn question=new Question_mgn();
		question.setQuestion_Id(1);
		question.setOption("OptionA");
		question.add(question);
		
		Question_mgn question_to_be_tested=question.find(question.getQuestion_Id());
		Assert.assertEquals("1",question_to_be_tested.getQuestion_Id());
		Assert.assertEquals("OptionA",question.getQuestion_Id());
	}

	@SuppressWarnings("unlikely-arg-type")
	@Test
	void testFindQuestion() {
		Question_mgn question=new Question_mgn();
		question.setOption("OptionB");
		try {
			question.add(question);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		Question_mgn question1=question.find(question.getQuestion_Id());
		Assert assert1 = Assert();
		assert1.equals(question1);
	}

	private Assert Assert() {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Test
	void testFindAllQuestion() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateQuestion() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteQuestion() {
		fail("Not yet implemented");
	}
*/
}
