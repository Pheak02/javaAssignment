import java.util.Scanner;

public class Ch4_Exercise8 {
    public static void main(String[] args) {
        final int numUpperLetters = 1;
        // PW always start with a digit
        final int numDigit = 1;
        final int numPW = 8;
        int upperCount = 0;
        int digitCount = 0;
        int pwCount = 0; // not sure yet!
        System.out.print("Please enter a password:");
        Scanner input = new Scanner(System.in);
        String pw = input.nextLine();
        int pwLen = pw.length();
        pwCount = pw.length();
        System.out.println("print number of pw:" + pwCount);
        for (int i = 0; i < pwLen; i++) {
            char ch = pw.charAt(i);
            if (Character.isUpperCase(ch))
                upperCount++;
            else if (Character.isDigit(ch))
                digitCount++;
        }
        if (upperCount >= numUpperLetters && digitCount >= numDigit && pwCount == numPW)
            System.out.println("Valid Password");
        else {
            System.out.println("Invalid Password! The password must has");
            if (pwCount != numPW)
                System.out.println("exactly 8 characters");
            // must start with a digit
            if (digitCount < numDigit)
                System.out.println("at least one digit");

            if (upperCount < numUpperLetters)
                System.out.println("at least one uppercase letter");
            // can't be anything beside letter & digit
            if (!Character.isDigit(pw.charAt(0))) {
                System.out.println("start with a digit");

            }
        }
    }
}
