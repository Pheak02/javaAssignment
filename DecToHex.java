import java.util.Scanner;

public class DecToHex {
    public DecToHex() {
        // create a constructor for the data structure
        Scanner userInput = new Scanner(System.in);
        int decimal, remainder;
        char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        String hexValue = "";

        System.out.println("Enter any number: ");
        decimal = userInput.nextInt();

        while (decimal > 0) {
            remainder = decimal % 16;
            hexValue = hex[remainder] + hexValue;
            decimal = decimal / 16;

        }
        System.out.println("Hexa value is: " + hexValue);
    }

    public static void main(String[] args) {
        DecToHex obj = new DecToHex();

    }
}