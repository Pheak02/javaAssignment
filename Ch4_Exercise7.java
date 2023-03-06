// import java.util.Scanner;

// public class Ch4_Exercise7 {
// public static void main(String[] args) {
// System.out.print("Please enter a statement: ");
// Scanner s1 = new Scanner(System.in);// get input from user
// String mainString = s1.nextLine(); // input line of text from user
// System.out.print("Enter the substring you want to remove:");
// Scanner s2 = new Scanner(System.in);
// String subString = s2.nextLine();
// int findInd = s1.indexOf(s2);
// if (findInd = -1) {
// int len = s2 / length();

// }

// }
// }
import java.util.Scanner;

class Ch4_Exercise7 {

    public static void main(String[] args) {

        // allow user to input string and substring
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = input.nextLine();
        System.out.print("Enter the substring: ");
        String substring = input.nextLine();
        input.close();

        // remove substring form string
        System.out.println(removeSubstring(string, substring));

    }

    // method removeSubstring allow parameter "string, substring"
    public static String removeSubstring(String string, String substring) {
        if (substring.isEmpty()) {
            return string;
        }
        String result = string.replaceAll(substring, "");
        return result;
    }
}
