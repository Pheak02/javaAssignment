import java.util.Scanner;

public class Ch4_Exercise4 {
    public static String sort(String word) {
        char[] chars = new char[word.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = word.charAt(i);
        }
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < chars.length - i - 1; j++) {
                if (Character.toLowerCase(chars[j]) > Character.toLowerCase(chars[j + 1])) {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String word = input.next();
        System.out.println("Sorted String: " + sort(word));
        input.close();
    }
}
