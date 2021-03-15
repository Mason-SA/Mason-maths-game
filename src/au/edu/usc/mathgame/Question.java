package au.edu.usc.mathgame;

import java.util.Random;

public class Question {

    private int value1;
    private int value2;
    private String operator;
    private int answer;
    Random rand = new Random();

    public void showQuestion() {

        value1 = rand.nextInt(20);
        value2 = rand.nextInt(20);

        System.out.printf("What is %2d + %2d? ", value1, value2);

    }


}
