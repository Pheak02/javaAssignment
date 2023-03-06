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
        int i = 0;
        char character = pw.charAt(i);
        for (i = 0; i < pwLen; i++) {
            char ch = pw.charAt(i);
            if (Character.isUpperCase(ch))
                upperCount++;
            else if (Character.isDigit(ch))
                digitCount++;
        }
        System.out.println("print upperCount" + upperCount);
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
            if (!Character.isDigit(pw.charAt(0)))
                System.out.println("start with a digit");
            if (!Character.isLetterOrDigit(character))
                System.out.println("consist of only digits and letters");
        }
    }
}

// --------------------------------------------------------------------

// import java.util.Scanner;

// class Ch4_Exercise8 {

// public static void main(String[] args) {

// // allow user to input password
// Scanner input = new Scanner(System.in);
// System.out.print("Enter Password: ");
// String password = input.nextLine();
// input.close();

// // check checkValidPassword
// checkValidPassword(password);

// }

// // method checkValidPassword allow parameter "password"
// public static void checkValidPassword(String password) {

// // Check length
// if (password.length() != 8) {
// System.out.println("Invalid password: length must be exactly 8 characters");
// return;
// }

// // Check characters
// for (int i = 0; i < password.length(); i++) {
// char c = password.charAt(i);
// if (!Character.isLetterOrDigit(c)) {
// System.out.println("Invalid password: must consist of only letters and
// digits");
// return;
// }
// }

// // Check first character is a digit
// if (!Character.isDigit(password.charAt(0))) {
// System.out.println("Invalid password: must start with a digit");
// return;
// }

// // Check at least one uppercase letter
// boolean hasUppercase = false;
// for (int i = 0; i < password.length(); i++) {
// char c = password.charAt(i);
// if (Character.isUpperCase(c)) {
// hasUppercase = true;
// break;
// }
// }
// if (!hasUppercase) {
// System.out.println("Invalid password: must contain at least one uppercase
// letter");
// return;
// }

// // Password meets all requirements
// System.out.println("Valid password");
// }

// }