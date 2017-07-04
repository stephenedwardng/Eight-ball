package com.example.user.eightball;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by user on 29/06/2017.
 */

public class AnswersTest {

    ArrayList<String> testAnswers;
    Answers answers;

    @Before
    public void setup() throws Exception {
        answers = new Answers();
        testAnswers = new ArrayList<String>();
        testAnswers.add("Yes");
        testAnswers.add("That would be an ecunemical matter!");

    }

    @Test
    public void createAnswersWithListTest() throws Exception{
        Answers answers = new Answers(testAnswers);
        assertEquals(2, answers.getLength());
    }

    @Test
    public void testGetAnswers() throws Exception {
        Answers answers = new Answers();
        assertNotNull(answers.getAnswers());
    }

    @Test
    public void testSetUpAnswers() throws Exception {
        Answers answers = new Answers();
        assertEquals(2, answers.getLength());
    }

    @Test
    public void addAnswer() throws Exception {

        int originalNumberOfAnswers = answers.getLength();
        answers.add("No!");
        assertEquals(originalNumberOfAnswers + 1, answers.getLength());
    }

    @Test
    public void getAnswerAtIndexTest() throws Exception {
        String result = answers.getAnswerAtIndex(0);
        assertEquals("Yes", result);
    }

    @Test
    public void getAnswerTest() throws Exception {
        Answers spyAnswers = Mockito.spy(answers);
        Mockito.when(spyAnswers.getAnswer()).thenReturn("Yes!");
        assertEquals("Yes!", spyAnswers.getAnswer());
//        String answer = answers.getAnswer();
//        assertNotNull(answer);
    }

}
