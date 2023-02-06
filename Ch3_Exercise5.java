public class Ch3_Exercise5 {

    public static void main(String[] args) {
        // declare 2 matrix size 3 by 3
        int[][] First_Matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] Second_Matrix = { { 0, 2, 4 }, { 1, 4, 9 }, { 2, 7, 5 } };
        int[][] sum = new int[3][3];

        // declare variables row and columns
        int i, j;
        System.out.println("Enter First-Matrix: ");

        // using for loop to output first-matrix
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(First_Matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter Second-Matrix:");

        // using for loop to output Second-matrix
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(Second_Matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate sum of 2 matrix
        System.out.println("Add 2 Matrix: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                sum[i][j] = First_Matrix[i][j] + Second_Matrix[i][j];
            }
        }

        // output sum of 2 matrix
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
