import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ch3_Exercise11 {

    public static void main(String[] args) {
        int score = 0;
        char operation;
        double[] userAnswer = new double[5]; // store user answer in array 5 element
        int[][] number = new int[5][2]; // store random number in matrix 5x2
        double[] answer = new double[5];
        char[] operate = new char[5]; // store operator +-x/
        DecimalFormat df = new DecimalFormat("#.##");
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < number.length; i++) {
            number[i][0] = random.nextInt(20) + 1; // random number and store it in array
            number[i][1] = random.nextInt(20) + 1;

            operation = (i == number.length - 1) ? "+-*/".charAt(random.nextInt(4)) : "+-*/".charAt(i);

            System.out.print("Question " + (i + 1) + " : What is " + number[i][0] + " " + operation + " " + number[i][1]
                    + " ? ");
            userAnswer[i] = scan.nextDouble(); // answer stored in userAnswer and i is index of array
            switch (operation) // calculate
            {
                case '+':
                    answer[i] = number[i][0] + number[i][1];
                    operate[i] = '+';
                    break;

                case '-':
                    answer[i] = number[i][0] - number[i][1];
                    operate[i] = '-';
                    break;

                case '*':
                    answer[i] = number[i][0] * number[i][1];
                    operate[i] = '*';
                    break;

                case '/':
                    answer[i] = number[i][0] / number[i][1];
                    operate[i] = '/';
                    break;

                default:
                    answer[i] = 0;
                    break;
            }
            if (answer[i] == userAnswer[i])
                score++;// check answer and count score
        }

        System.out.println("You get " + score + " correct answers out of 5. The detail is below: ");
        for (int i = 0; i < number.length; i++) {

            if (operate[i] == '/') {
                if (userAnswer[i] == (int) userAnswer[i]) { // print int number
                    System.out.print("Question " + (i + 1) + ": " + number[i][0] + " " + operate[i] + " " + number[i][1]
                            + " = " + (int) userAnswer[i]);
                } else // print double number
                {
                    System.out.print("Question " + (i + 1) + ": " + number[i][0] + " " + operate[i] + " " + number[i][1]
                            + " = " + userAnswer[i]);
                }
                if (userAnswer[i] == answer[i]) {
                    System.out.println("\t Correct");
                } else {
                    if (number[i][0] % number[i][1] == 0) { // print int if no remainder
                        System.out.printf("\t Incorrect. The correct answer is %d\n", (int) answer[i]);
                    } else // print double number
                    {
                        System.out.printf("\t Incorrect. The correct answer is %.2f\n", answer[i]);
                    }
                }
            } else {

                if (userAnswer[i] == (int) userAnswer[i]) {
                    System.out.print("Question " + (i + 1) + ": " + number[i][0] + " " + operate[i] + " " + number[i][1]
                            + " = " + (int) userAnswer[i]);
                } else {
                    System.out.print("Question " + (i + 1) + ": " + number[i][0] + " " + operate[i] + " " + number[i][1]
                            + " = " + userAnswer[i]);
                }
                if (userAnswer[i] == answer[i]) {
                    System.out.println("\t Correct");
                } else {
                    System.out.println("\t Incorrect. The correct answer is " + (int) answer[i]);
                }

            }
            scan.close();
        }
    }
}
