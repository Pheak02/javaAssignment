public class Homework15 {
    public static boolean isConsecutiveFour(int[][] array2D) {
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {

                if (j + 3 < array2D[i].length) {
                    if (array2D[i][j] == array2D[i][j + 1] && array2D[i][j + 1] == array2D[i][j + 2]
                            && array2D[i][j + 2] == array2D[i][j + 3]) {
                        return true;
                    }
                }
                if (i + 3 < array2D.length) {
                    if (array2D[i][j] == array2D[i + 1][j] && array2D[i + 1][j] == array2D[i + 2][j]
                            && array2D[i + 2][j] == array2D[i + 3][j]) {
                        return true;
                    }
                }
                if (i + 3 < array2D.length - 1 && j - 3 >= 0) {
                    if (array2D[i][j] == array2D[i + 1][j - 1] && array2D[i + 1][j - 1] == array2D[i + 2][j - 2]
                            && array2D[i + 2][j - 2] == array2D[i + 3][j + 3]) {
                        return true;
                    }
                }
                if (i + 3 < array2D.length && j + 3 < array2D[0].length) {
                    if (array2D[i][j] == array2D[i + 1][j + 1] && array2D[i + 1][j + 1] == array2D[i + 2][j + 2]
                            && array2D[i + 2][j + 2] == array2D[i + 3][j + 3]) {
                        return true;
                    }
                }
            }
        }

        /*
         * // check horizontal
         * for (int i = 0; i < array2D.length; i++){
         * for (int j = 0; j < array2D[i].length - 3; j++){
         * if (array2D[i][j] == array2D[i][j+1] && array2D[i][j+1] == array2D[i][j+2] &&
         * array2D[i][j+2] == array2D[i][j+3]){
         * return true;
         * }
         * }
         * }
         * // check vertical
         * for (int i = 0; i < array2D.length; i++){
         * for (int j = 0; j < array2D[i].length - 3; j++){
         * if (array2D[i][j] == array2D[i+1][j] && array2D[i+1][j] == array2D[i+2][j] &&
         * array2D[i+2][j] == array2D[i+3][j] ){
         * return true;
         * }
         * }
         * }
         * // check diagonal bottom to top
         * for (int i = 3; i < array2D.length; i++) {
         * for (int j = 0; j < array2D[i].length - 3; j++){
         * if (array2D[i][j] == array2D[i-1][j+1] && array2D[i-1][j+1] ==
         * array2D[i-2][j+2] && array2D[i-2][j+2] == array2D[i-3][j+3]){
         * return true;
         * }
         * }
         * }
         * // check diagonal top to bottom
         * for (int i = 0; i < array2D.length - 3; i++){
         * for (int j = 0; j < array2D[i].length - 3; i++){
         * if (array2D[i][j] == array2D[i+1][j+1] && array2D[i+1][j+1] ==
         * array2D[i+2][j+2] && array2D[i+2][j+2] == array2D[i+3][j+3]){
         * return true;
         * }
         * }
         * }
         */
        return false;
    }

    public static void main(String[] args) {
        int[][] array1 = {
                { 0, 1, 0, 3, 1, 6, 1 },
                { 0, 1, 6, 8, 6, 0, 1 },
                { 5, 6, 2, 1, 8, 2, 9 },
                { 6, 5, 6, 1, 1, 9, 1 },
                { 1, 3, 6, 1, 4, 0, 7 },
                { 3, 3, 3, 3, 4, 0, 7 }
        };
        int[][] array2 = {
                { 0, 1, 0, 3, 1, 6, 1 },
                { 0, 1, 6, 8, 6, 0, 1 },
                { 5, 5, 2, 1, 8, 2, 9 },
                { 6, 5, 6, 1, 1, 9, 1 },
                { 1, 5, 6, 1, 4, 0, 7 },
                { 3, 5, 3, 3, 4, 0, 7 },
        };
        int[][] array3 = {
                { 0, 1, 0, 3, 1, 6, 1 },
                { 0, 1, 6, 8, 6, 0, 1 },
                { 5, 6, 2, 1, 6, 2, 9 },
                { 6, 5, 6, 6, 1, 9, 1 },
                { 1, 3, 6, 1, 4, 0, 7 },
                { 3, 6, 3, 3, 4, 0, 7 },
        };
        int[][] array4 = {
                { 0, 1, 0, 3, 1, 6, 1 },
                { 0, 1, 6, 8, 6, 0, 1 },
                { 9, 6, 2, 1, 8, 2, 9 },
                { 6, 9, 6, 1, 1, 9, 1 },
                { 1, 3, 9, 1, 4, 0, 7 },
                { 3, 3, 3, 9, 4, 0, 7 }
        };
        System.out.println(isConsecutiveFour(array1));
        System.out.println(isConsecutiveFour(array2));
        System.out.println(isConsecutiveFour(array3));
        System.out.println(isConsecutiveFour(array4));
    }
}
