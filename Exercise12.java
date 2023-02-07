
//Binary to hexa
import java.util.Scanner;
import java.util.Arrays;

class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wholeLength, fractionLength;
        String hexa = "";
        String hexa_digits = "0123456789ABCDEF";
        String[] quad_array = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };

        // Ask the user to enter a binary
        System.out.print("Enter a binary: ");
        String binary = input.nextLine(); // 110.10011, 110
        input.close();

        // Find the lenghts of whole part and fraction part
        if (binary.contains(".")) { // float
            wholeLength = binary.indexOf('.');
            fractionLength = binary.length() - wholeLength - 1;
        } else { // integer
            wholeLength = binary.length();
            fractionLength = 0;
        }

        // add leading and trailing zero(s)
        String[] zeros = { "", "000", "00", "0" };
        binary = zeros[wholeLength % 4] + binary + zeros[fractionLength % 4];

        // Convert the binary into hexa
        for (int i = 0; i < binary.length(); i += 4) {
            if (binary.charAt(i) == '.') {
                hexa += '.';
                i++;
            }
            String quad = binary.substring(i, i + 4);
            hexa += hexa_digits.charAt(Arrays.asList(quad_array).indexOf(quad));
        }

        System.out.print(hexa);
    }
}