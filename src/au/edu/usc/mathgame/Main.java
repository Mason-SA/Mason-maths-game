package au.edu.usc.mathgame;
import java.util.Scanner;
import java.util.ArrayList;

import static java.lang.System.currentTimeMillis;


/**
 * A simple console-based maths quiz for primary school children.
 *
 * @author Stephen Anthony Mason
 * @author Author2
 */

public class Main   {

    private static int score = 0;
    public ArrayList<Question> questions;
    public ArrayList<Question> incorrectQuestions;
    HighScores hs = new HighScores();
    long startTime = currentTimeMillis();

    /* playGame class sends 10 instances of the Question class to an array list (questions),
    retrieves those instances from the questions array list and calls two methods from the
    Question class. It also tracks and prints the score for the round as well as adding any
    incorrectly answered questions to a new array list (incorrectQuestions) and then adds
    those questions to the end of the quiz, while not tracking score for them.
     */

    public void playGame()  {

        questions = new ArrayList<>();
        incorrectQuestions = new ArrayList<>();
        int j = 0;
        int indexNumber = 0;
        int incIndex = 0;
        int c = 0;


        int i = 0;
        do {
            Question q1 = new Question();
            questions.add(q1);
            i ++;
        }   while (i < 10);

        do  {
            Question q = questions.get(indexNumber);
            q.showQuestion();
            q.checkAnswer();

            if (q.good == 0) {
                score ++;
            } else  {
                incorrectQuestions.add(q);
            }


            System.out.println("Your current score is " + score);
            indexNumber ++;
            j ++;
        }   while   (j < questions.size());

        if (score < 10 && c < incorrectQuestions.size())    {
            Question q2 = incorrectQuestions.get(incIndex);
            q2.showQuestion();
            q2.checkAnswer();
            incIndex ++;
            c ++;
        }

    }

    /*
        playMultipleGames class calls the playGame method, adds the final score at the end
        of the round to a high score array list and then prints the high scores played so far.
        The method also tracks and prints the amount of time it takes for the player to complete
        a round of the game. The primary function of the method is to ask the player if they would
        like to play a second round and call the playGame method again if they say yes.
     */

    public void playMultipleGames() {
        boolean play = true;
        Scanner input = new Scanner(System.in);

        while (play)    {
            playGame();

            if  (score <= 4) {
                System.out.println("Good start! Practice more to improve your score.");
            }   else if (score >= 5 && score <= 7)    {
                System.out.println("That's a great score! Well done");
            }   else {
                System.out.println("Congratulations, that's an incredible score!");
            }

            questions.clear();
            hs.highScores.add(score);
            long endTime = currentTimeMillis();
            double timeTakenMilli = endTime - startTime;
            double timeTakenSec = timeTakenMilli / 1000.0;
            System.out.println("This round took you " + timeTakenSec + "  seconds to complete");
            System.out.println("Your high scores are:");
            hs.printScore();
            score = 0;
            System.out.println("Would you like to play again Y/N?");
            play = input.nextLine().trim().equalsIgnoreCase("y");
        }


    }

    /*
        The main method simply calls the playMultipleGames method
     */

    public static void main(String[] args)  {

        Main main = new Main();
        main.playMultipleGames();

    }
}