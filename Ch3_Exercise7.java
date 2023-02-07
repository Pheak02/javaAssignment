import java.util.Scanner;

public class Ch3_Exercise7 {

    public static void main(String[] args) {

        Scanner userGuess = new Scanner(System.in);
        int correctCount = 0;
        for (int i = 0; i < city.length; i++) {
            i = (int) (Math.random() * city.length); // random 1 among the all lenght.
            System.out.print("What is the capital city of " + city[i][0] + "? "); // get user input & access arr memo

            String s = userGuess.nextLine();
            if (s.equalsIgnoreCase(city[i][1])) {
                System.out.println("Wahh! You got the correct answer, CONGRATULATIONS!");
                correctCount++;
            } else {
                System.out.println("Nahh, not yet correct! The correct answer is " + city[i][1]);
                break;

            }

        }
        System.out.println("The correct count is " + correctCount);
    }
    // improve:
    // 1. count the correct answer
    // stop when quess wrong ans

    public static String[][] city = {
            { "Cambodia", "Phnom Penh" },
            { "Thailand", "Bangkok" },
            { "China", "Beijing" },
            { "Japan", "Tokyo" },
            { "India", "Delhi" },
            { "Malaysia", "Kuala Lumpur" }
    };
}