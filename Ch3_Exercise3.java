import java.util.Scanner;

public class Ch3_Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        input.close();

        int diagonal = n + n - 1;
        int midpoint = diagonal / 2;

        for (int g = n - 1; g > 0; g--) {
            for (int i = g, j = 0; i <= midpoint; j++, i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int g = 0; g < arr.length; g++) {
            for (int i = 0, j = g; j < arr.length; j++, i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
