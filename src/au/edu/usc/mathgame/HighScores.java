package au.edu.usc.mathgame;
import java.util.ArrayList;

public class HighScores {
    public static boolean good = false;
    public ArrayList<Integer> highScores;

    public HighScores() {

        highScores = new ArrayList<Integer>();


    }

    public void printScore()    {
        highScores.forEach(hiScr ->{
            System.out.println(hiScr);
        });
    }

    }


