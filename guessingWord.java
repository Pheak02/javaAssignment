import java.util.Scanner;

public class guessingWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String secretWord = "giraffe";
        String guess = "";
        int guessCount = 0;
        int guessLimit = 3;
        boolean outOfGuesses = false; // so if it = true -> out of guess.

        while (!guess.equals(secretWord) && !outOfGuesses) {
            if (guessCount < guessLimit) {
                System.out.println();
                System.out.println("Enter a guess:");
                guess = scan.nextLine();
                guessCount++;
            } else {
                outOfGuesses = true;
            }
        }
        if (outOfGuesses) {
            System.out.println("You lost");
        } else {

            System.out.println("You win!");
        }

    }
}