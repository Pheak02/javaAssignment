import java.util.Scanner;

public class CheckValidPW {
    public static void main(String[] args) {
        final int numUpperLetters = 2;
        final int numLowerLetters = 3;
        final int numDigit = 1;
        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        int letterCount = 0; // set letterCount to 8
        System.out.print("Please enter a Password: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int inputLen = input.length();
        for (int i = 0; i < inputLen; i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch))
                upperCount++;
            else if (Character.isLowerCase(ch))
                lowerCount++;
            else if (Character.isDigit(ch))
                digitCount++;
        }
        if (upperCount >= numUpperLetters && lowerCount >= numLowerLetters && digitCount >= numDigit)
            System.out.println("Valid Password");
        else {
            System.out.println("The password must contains");
            if (upperCount < numUpperLetters)
                System.out.println("2 Uppercase Letters");
            if (lowerCount < numLowerLetters)
                System.out.println("3 Lowercase Letters");
            if (digitCount < numDigit)
                System.out.println("at least 1 digits");

        }

    }

}
