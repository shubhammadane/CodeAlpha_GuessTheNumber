package guessTheNumber;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber
{
    public static void main(String[] args) 
    {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        
        // Initialize variables
        int attempts = 0;
        boolean hasGuessed = false;
        
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Guess the Number game.....");
        System.out.println("I have selected a random number between 1 and 100......");
        
        // Main game loop
        while (!hasGuessed) 
        {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess == numberToGuess) 
            {
                hasGuessed = true;
                System.out.println("Congratulations you guessed the number in " + attempts + " attempts.....");
            } else if (userGuess < numberToGuess) 
            {
                System.out.println("Try a higher number.......");
            } else
            {
                System.out.println("Try a lower number.......");
            }
        }
        
        // Close the Scanner
        scanner.close();
    }
}
