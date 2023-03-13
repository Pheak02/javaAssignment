import java.util.Scanner;

public class Ch4_Exercise8a {
    public static void main(String[] args) {
        // Initialize local variable
        final int numUpperLetters = 1;
        final int numDigit = 1;
        final int numPW = 8;
        // Initailize the count to 0
        int upperCount = 0;
        int digitCount = 0;
        int pwCount = 0;
        // Get User input
        System.out.print("Please enter a password:");
        Scanner input = new Scanner(System.in);
        String pw = input.nextLine();
        // Count length of Unser Input Password
        int pwLen = pw.length();
        pwCount = pw.length();
        // Initalize i so that can call to use later outside the for loop
        int i = 0;
        char character = pw.charAt(i);
        System.out.println(checkValidPassword(pw));
        

    public static String checkValidPassword(String pw){

    }
    // for loop to check UPPERCASE & DIGIT only
    for(i=0;i<pwLen;i++)

    {
        char ch = pw.charAt(i);
        if (Character.isUpperCase(ch))
            upperCount++;
        else if (Character.isDigit(ch))
            digitCount++;
    }
    // check condition
    if(upperCount>=numUpperLetters&&digitCount>=numDigit&&pwCount==numPW)System.out.println("WOOHOO! Valid Password!!");else
    {
        System.out.println("Invalid Password! The password must has");
        // MUST HAVE EXACTLY 8 CHARACTERS
        if (pwCount != numPW)
            System.out.println("exactly 8 characters");
        // MUST CONTAIN DIGIT
        if (digitCount < numDigit)
            System.out.println("at least one digit");
        // MUST CONTAINS UPPERCASE LETTER
        if (upperCount < numUpperLetters)
            System.out.println("at least one uppercase letter");
        // MUST START WITH A DIGIT
        if (!Character.isDigit(pw.charAt(0)))
            System.out.println("start with a digit");
        // CONTAINS DIGITS & LETTERS ONLY
        if (!Character.isLetterOrDigit(character))
            System.out.println("consist of only digits and letters");
    }
}
}
