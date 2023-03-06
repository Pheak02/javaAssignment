import java.util.*;

public class Ch4_Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of even palindromes you want the program to generate: ");
        int numPalindromes = sc.nextInt();

        int[] palindromes = generatePalindromes(numPalindromes);
        System.out.println(Arrays.toString(palindromes));
    }

    public static int[] generatePalindromes(int numPalindromes) {
        int[] palindromes = new int[numPalindromes];
        int count = 0;
        int i = 0;

        while (count < numPalindromes) {
            String numString = Integer.toString(i);
            String reversedString = new StringBuilder(numString).reverse().toString();

            if (numString.equals(reversedString)) {
                palindromes[count] = i;
                count++;
            }

            i += 2;
        }

        return palindromes;
    }
}