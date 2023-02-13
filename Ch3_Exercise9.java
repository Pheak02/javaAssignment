import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ch3_Exercise9 {
    public static void main(String[] args) {
        double[][] banks = {
                { 25, 100.5, 0, 0, 320.5 },
                { 0, 125, 40, 85, 0 },
                { 125, 0, 175, 75, 0 },
                { 125, 0, 0, 75, 0 },
                { 0, 0, 125, 0, 181 } };
        double[] total = new double[5];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the minimum limits: ");
        double userInput = input.nextDouble();

        boolean isSafe = false;
        // make ArrayList name unsafebanks datatype Integer
        ArrayList<Integer> unsafeBanks = new ArrayList<>();

        while (!isSafe) {
            isSafe = true; // gets set false if indexUnsafeBanks is changed
            for (int i = 0; i < total.length; i++) {
                total[i] = banks[i][0];
                for (int j = 1; j < total.length; j++) {
                    total[i] = total[i] + banks[i][j];
                }
            }

            for (int i = 0; i < total.length; i++) {
                // compare to the limit and avoid the unsafe bank
                if (total[i] < userInput && !unsafeBanks.contains(i)) {
                    for (int j = 0; j < total.length; j++) {
                        banks[j][i] = 0;
                    }
                    unsafeBanks.add(i);
                    isSafe = false;
                }
            }
        }
        System.out.println("The bank that unsafe: ");
        Collections.sort(unsafeBanks);
        for (int i = 0; i < unsafeBanks.size(); i++) {
            System.out.println("bank " + unsafeBanks.get(i));
        }
        if (unsafeBanks.size() == 0) {
            System.out.println("Don't have");
        }
        input.close();
    }
}
