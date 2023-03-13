import java.util.Scanner;

public class Ch4_Exercise9_SaingSopheak {
    public static void main(String[] args) {
        displayLargest();
    }

    static void displayLargest() {
        int n, max;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        n = s.nextInt();
        System.out.println("Enter the elements of array:");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        max = a[0];
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Maximum value in the array is:" + max);

    }
}