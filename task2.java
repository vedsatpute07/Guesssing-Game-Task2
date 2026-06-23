import java.util.*;

public class task2 {

    // Method to generate a random number between 1 and 100
    public static int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }

    // Method to provide hints based on the user's guess
    public static String giveHint(int number, int guess) {
        if (guess > number) {
            return "Greater";
        } else if (number == guess) {
            return "Right";
        } else {
            return "Smaller";
        }
    }

    // Method to run the guessing game with scoring
    public static void runGuess() {
        int secretNumber = getRandomNumber();
        int userGuess;
        String hint;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Guess the number (between 1 and 100):");

        while (true) {
            System.out.print("Enter your guess: ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); 
                continue;
            }

            userGuess = scanner.nextInt();
            attempts++;

            // Check if the guess is out of range
            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }

            hint = giveHint(secretNumber, userGuess);

            if (hint.equals("Right")) {
                int points = Math.max(11 - attempts, 1); // Score: 10 for 1st try, 9 for 2nd, ..., 1 for 10th or more
                System.out.println("Congratulations! You guessed it right!");
                System.out.println("Attempts: " + attempts);
                System.out.println("Points earned: " + points);
                break;
            } else {
                System.out.println(hint);
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        runGuess();
    }
}