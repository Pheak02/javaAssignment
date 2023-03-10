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
        String result = string.replaceAll(substring, "");
        return result;
    }
}
