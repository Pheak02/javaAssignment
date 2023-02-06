public class Ch3_Exercise2 {
  public static void main(String[] args) {
    // declear 2D Arr
    int[][] matrix = { { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 } };
    int rows = matrix.length;
    int columns = matrix[0].length;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j <= i; j++) {
        int row = i - j;
        int column = j;
        System.out.print(matrix[row][column] + " ");
      }
      System.out.println();
    }

    for (int i = 1; i < columns; i++) {
      for (int j = i; j < rows; j++) {
        int row = rows - 1 - j + i;
        int column = j;
        System.out.print(matrix[row][column] + " ");
      }
      System.out.println();
    }
  }
}
