import java.util.Random;
import java.util.Scanner;
public class AboutComments
{
    public static void main(String[] args)
    {
/*This is about Random Numebers
*
*/



            Scanner scan = new Scanner(System.in);

            //working on Random Numbers from 1 to 100
            Random random = new Random();
            int from = 1;
            int to = 100;
            int randomNumber = random.nextInt(to - from + 1) + from;

            // The number is assigned and initialized
            int guessedNumber = 0;

            //The guessed numbers are printed
            System.out.printf("The number is between %d and %d.\n", from, to);

            //The process goes on until the correct number is guessed
            do
            {
                System.out.print("Guess what the number is: ");
                guessedNumber = scan.nextInt();
                if (guessedNumber > randomNumber)
                    System.out.println("Your guess is too high!");
                else if (guessedNumber < randomNumber)
                    System.out.println("Your guess is too low!");
                else
                    System.out.println("You got it!");
            } while (guessedNumber != randomNumber);
        }
    }


