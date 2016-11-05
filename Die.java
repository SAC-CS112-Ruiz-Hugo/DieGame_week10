/**
 * Created by Culebra on 11/5/2016.
 */
import java.util.Scanner;
import java.util.Random;

public class Die {
    public static void main (String[] args)
    {
        Dice access = new Dice();
        int userRight = 0;
        int userWrong = 0;
        int diceRoll = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("How many rolls would you like to throw?");
        diceRoll = in.nextInt();
        access.numOfThrows();

        access.Throw();
        int systemRoll = access.Throw();

            if (diceRoll == systemRoll) {
                System.out.println("You guessed right!");
                System.out.println("Computer picked: ");
                System.out.println(systemRoll);
                userRight++;
            } else
                System.out.println("You guessed wrong :(");
                System.out.println("Computer picked: ");
                System.out.println(systemRoll);
                userWrong++;
    }
}
