public class Hw2 {
    public static void main(String[] args) {
        int[][] arr2D = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8, },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        // Iterate the arr diagonally right up
        for (int row = 0; row < 7; row++) { // 4+4-1=7
            // ថយ row កើន col
            // 2 para. for col កើន & ថយ(when we print)
            // 2D arr must use with 2 loop(nested loop)
            for (int r = row, c = 0; r >= 0 && c <= 3; r--, c++) {
                if (r > 3)// out of bound
                    continue;
                System.out.println(arr2D[r][c] + " ");
            }
            System.out.println(); // to index new line - ចុះបន្ទាត់

        }n
    }
}
