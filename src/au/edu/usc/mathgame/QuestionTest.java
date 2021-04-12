package au.edu.usc.mathgame;
@test

public class QuestionTest {

    void testCreate()   {
        Question q = new Question(3, 4, "+");
        assertFalse(q.checkAnswer());
    }


}
