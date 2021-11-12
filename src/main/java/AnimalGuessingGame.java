
import java.util.Scanner;

public class AnimalGuessingGame {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String secretAnimal = "lion";
        String guess = "";
        int guessCount = 0;
        int guessLimit = 3;
        boolean outOfGuesses = false;

        while (!guess.equals(secretAnimal) && !outOfGuesses) {

            if (guessCount < guessLimit) {
                System.out.println(" Guess the secret animal: ");
                guess = userInput.nextLine();
                guessCount++;
            } else {
                outOfGuesses = true;
                System.out.println(" You lose, better luck next time! ");
            }
            if (guess.equals(secretAnimal)) {
                System.out.println(" You Win! ");
            }
        }
    }
}
