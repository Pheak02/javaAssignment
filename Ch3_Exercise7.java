import java.util.Scanner;

public class Ch3_Exercise7 {

    public static void main(String[] args) {

        Scanner userGuess = new Scanner(System.in);
        int correctCount = 0;
        for (int i = 0; i < stateCapitals.length; i++) {
            i = (int) (Math.random() * stateCapitals.length);

            System.out.print("What is the capital of " + stateCapitals[i][0] + "? ");
            String s = userGuess.nextLine();
            if (s.equalsIgnoreCase(stateCapitals[i][1])) {
                System.out.println("Wahh! You got the correct answer, CONGRATULATIONS!");
                correctCount++;
            } else {
                System.out.println("Nahh, not yet correct! The correct answer is " + stateCapitals[i][1]);
            }
        }
        System.out.println("The correct count is " + correctCount);
    }
    // improve:
    // 1. count the correct answer
    // stop when quess wrong ans

    private static String[][] stateCapitals = {
            { "Cambodia", "Phnom Penh" },
            { "Thailand", "Bangkok" },
            { "China", "Beijing" },
            { "Japan", "Tokyo" },
            { "India", "Delhi" },
            { "Malaysia", "Kuala Lumpur" }
    };
}