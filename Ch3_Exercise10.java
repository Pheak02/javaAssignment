public class Ch3_Exercise10 {
    public static void main(String[] args) {
        String[] groupNum = { "1", "2" };
        int totalInEach = 0;
        int totalScore = 0;
        // double percentage = 0;
        // int[][][] scores = new int[2][3][4];

        int[][][] scores = {
                { { 50, 30, 70 }, { 60, 40, 80 }, { 70, 50, 90 }, { 80, 60,
                        100 } },
                { { 55, 35, 75 }, { 65, 45, 85 }, { 75, 55, 95 }, { 85, 65,
                        90 } }
        };
        // gr: group
        // st: student
        // sc: score

        for (int gr = 0; gr < 2; gr++) {
            for (int i = 0; i < 2; i++) {
                System.out.println("group " + groupNum[i] + ":");
                System.out.println(
                        "-------------------------------------------------------------------------------------");
                System.out.println(
                        "Name                         " + "Math                    "
                                + "Physics                 "
                                + "Chemistry                     " + "Total");
                System.out.println(
                        "-------------------------------------------------------------------------------------");
                for (int st = 0; st < 4; st++) {
                    System.out.print("Student" + (st + 1));
                    for (int sc = 0; sc < 3; sc++) {
                        System.out.print("                    " + scores[gr][st][sc]);
                        totalInEach += scores[gr][st][sc];
                        // percentage = (double) totalInEach / 3;
                        // to reset total to 0, after the loop end.
                        // totalScore += totalInEach;

                    }
                    // System.out.print(" " + totalInEach);
                    // totalInEach = 0;
                    // System.out.println("Total Score: " + totalScore);
                    // System.out.println("Percentage: " + percentage);
                }
                System.out.println();
            }

            break;

        }

    }
}
