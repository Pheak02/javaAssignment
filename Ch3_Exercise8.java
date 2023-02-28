public class Ch3_Exercise8 {

    public static void main(String[] args) {
        int[][] employeeHour = {
                { 2, 4, 3, 4, 5, 8, 8 },
                { 7, 3, 4, 3, 3, 4, 4 },
                { 3, 3, 4, 3, 3, 2, 2 },
                { 9, 3, 4, 7, 3, 4, 1 },
                { 3, 5, 4, 3, 6, 3, 8 },
                { 3, 4, 4, 6, 3, 4, 4 },
                { 3, 7, 4, 8, 3, 8, 4 },
                { 6, 3, 5, 9, 2, 7, 9 },
        };
        // int[][][] employeeHour = {
        // { { 0 }, { 2, 4, 3, 4, 5, 8, 8 }, {} },
        // { { 1 }, { 3, 4, 3, 3, 4, 4 }, {} },
        // { { 2 }, { 3, 4, 3, 3, 2, 2 }, {} },
        // { { 3 }, { 3, 4, 7, 3, 4, 1 }, {} },
        // { { 4 }, { 5, 4, 3, 6, 3, 8 }, {} },
        // { { 5 }, { 4, 4, 6, 3, 4, 4 }, {} },
        // { { 6 }, { 7, 4, 8, 3, 8, 4 }, {} },
        // { { 7 }, { 3, 5, 9, 2, 7, 9 }, {} },
        // };
        int[][] employee = new int[8][2];
        for (int i = 0; i < employeeHour.length; i++) {
            int sum = 0;
            for (int j = 0; j < employeeHour[i].length; j++) {
                sum += employeeHour[i][j];
            }
            employee[i][1] = sum;
            employee[i][0] = i;
        }
        for (int i = 0; i < employee.length; i++) {
            for (int j = 0; j < employee.length; j++) {
                if (employee[j][1] < employee[i][1]) {
                    int temp = employee[i][1];
                    employee[i][1] = employee[j][1];
                    employee[j][1] = temp;
                    temp = employee[i][0];
                    employee[i][0] = employee[j][0];
                    employee[j][0] = temp;
                }
            }
        }
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Employee " + (employee[i][0] + 1) +
                    " works a total of " + employee[i][1]);
        }
    }

}
