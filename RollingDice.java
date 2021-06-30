import java.util.Random;

public class RollingDice {
    // With this small app you'll be able to roll your dice to get a random number
    //Have fun
    /**
     * @author job v.
     * @param args
     */
    public static void main(String []args)
        {
            // With Random Instance, you can stream of pseudorandom numbers.
            // Number 6 is the indicador of your Dice, and the +1 is because is using remember that the sequence starts with 0.
            //If you remove the +1 after (6), you are going to get numbers from 0 to 5.

            Random insertNumber = new Random();
            int r = insertNumber.nextInt(6) + 1;


        System.out.println("Your rolled a " + r +", Nice!");
        }
    
}
