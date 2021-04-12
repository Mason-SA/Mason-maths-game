package au.edu.usc.mathgame;
import java.util.Scanner;
import java.util.Random;

public class Question {
    private int value1;
    private int value2;
    private String operator;
    private int answer;
    Random rand = new Random();
    boolean good;
    private static int score = 0;
    int questionType = rand.nextInt(4);




    public Question(Random rand){
        this.rand = rand;
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


    public void showQuestion(){

        System.out.println("What is " + value1 + operator + value2 + "?");

    }

    public void checkAnswer(){
        Scanner input = new Scanner(System.in);
        int correct = answer;
        int response = input.nextInt();
        if (response == correct){
            good = true;
            System.out.println("Correct!");
            score ++;
        }else{
            System.out.println("Incorrect. The correct answer is " + correct + "!");
        }
        System.out.println("Your score is " + score);

    }
}