public class Ch3_Exercise1 {

    public static void main(String[] args) {
        char[][] matrix = new char[10][10];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                int randomLetter = (int) (Math.random() * 26) + 'A';// A is the ascii code, A=65
                // OR int randomLetter = (int) (Math.random() * 26) + '65';
                matrix[row][col] = (char) randomLetter; // change from ascii code to character
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println("");
        }
    }
}
// no need to import math cuz in javalang which is default package