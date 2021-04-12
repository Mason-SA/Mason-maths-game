package au.edu.usc.mathgame;
import java.util.Random;
import java.util.Scanner;

/**
 * A simple console-based maths quiz for primary school children.
 *
 * @author Stephen Anthony Mason
 * @author Author2
 */
public class Main   {

    public void playGame()  {
        Random rand = new Random();

        for (int i = 0; i < 10; i++)    {
            Question q1 = new Question(rand);
            q1.showQuestion();
            q1.checkAnswer();

        }
    }

    public void playMultipleGames() {
        boolean play = true;
        Scanner input = new Scanner(System.in);
        while (play)    {
            playGame();
            System.out.println("Would you like to play again Y/N?");
            play = input.nextLine().trim().equalsIgnoreCase("y");
        }

    }

    public static void main(String[] args)  {

        Main main = new Main();
        main.playMultipleGames();

        }
}