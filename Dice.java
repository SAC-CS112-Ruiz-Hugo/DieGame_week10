import java.util.Random;

public class Dice {

    private int bounces;

    public int Throw()
    {
        Random rand = new Random();
        int systemRoll = rand.nextInt(6) + 1;

        return systemRoll;
    }

    public void numOfThrows()
    {
        int numOfThrows = 0;
    }
}
