package au.edu.usc.mathgame;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;

class QuestionTest {

    @Test
    void testCreate() {
        Question q1 = new Question(3, 4, "+");
        assertFalse(q1.checkAnswer(0));
        assertFalse(q1.checkAnswer(7));

        Question q2 = new Question(7, 4, "-");
        assertFalse(q2.checkAnswer(0));

        Question q3 = new Question(2, 3, "8");
        assertFalse(q3.checkAnswer(0));

        Question q4 = new Question(15, 5, "/");
        assertFalse(q4.checkAnswer(0));


    }
}