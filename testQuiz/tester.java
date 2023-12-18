package testQuiz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class tester {
	
	public QuizOneJunit‎ obj;
	
	@Before
	public void init() {
		this.obj = new QuizOneJunit‎() ;
	}
	
	@Test
	public void tc101() {
		assertEquals(2, obj.countLetterA("Avocado"));
	}
	
	@Test
	public void tc102() {
		assertEquals(0, obj.countLetterA("Johnny"));
	}
	
	@Test
	public void tc201() {
		assertEquals(false, obj.checkTwoLetter("HELLO"));
	}
	
	@Test
	public void tc202() {
		assertEquals(true, obj.checkTwoLetter("AB"));
	}


}
