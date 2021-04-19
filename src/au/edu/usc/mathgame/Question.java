package au.edu.usc.mathgame;
import java.util.Scanner;
import java.util.Random;

public class Question   {
    private int value1;
    private int value2;
    private String operator;
    private int answer;
    Random rand = new Random();
    int questionType = rand.nextInt(4);
    public static int good;

    /*
    The Question constructor sets the value1 and value2 variables to a random number.
    It also uses a switch statement to generate a random mathematical operator, as well
    as calculating the correct answer for the equation.
     */

    public Question()    {
        value1 = rand.nextInt(9) + 1;
        value2 = rand.nextInt(9) + 1;
        switch(questionType){
            case 0:
                operator = "+";
                answer = value1 + value2;
                break;
            case 1:
                operator = "-";
                answer = value1 - value2;
                break;
            case 2:
                operator = "*";
                answer = value1 * value2;
                break;
            case 3:
                int tempValue = value1 * value2;
                operator = "/";
                answer = tempValue / value2;
                value1 = tempValue;
                break;
        }

    }

    /*
    The showQuestion method simply prints to console the 2 random numbers seperated by the
    random operator as a question to the user
     */

    public void showQuestion()  {

        System.out.println("What is " + value1 + operator + value2 + "?");

    }

    /*
    the checkAnswer method scans the user input and checks it against the calculated
    correct answer generated in the Question constructor. It tells the user if they
    were correct or incorrect and tells them the correct answer if they had gotten it wrong
     */

    public void checkAnswer()   {
        Scanner input = new Scanner(System.in);
        int correct = answer;
        int response = input.nextInt();

        if (response == correct){
            good = 0;
            System.out.println("Correct!");
        }  else{
            good = 1;
            System.out.println("Incorrect. The correct answer is " + correct + "!");
        }

    }

}