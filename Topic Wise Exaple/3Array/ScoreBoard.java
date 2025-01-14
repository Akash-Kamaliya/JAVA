import java.util.*;

public class ScoreBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of innings, overs, and balls per over
        // System.out.print("Enter the number of innings: ");
        // int innings = scanner.nextInt();

        // Array to store team names
        String[] teamNames = new String[2];

        // Input team names
        System.out.println("\nEnter the names of the teams:");

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter the name of Team " + (i + 1) + ": ");
            teamNames[i] = scanner.nextLine();
        }

        System.out.print("Enter the number of overs per inning: ");
        int overs = scanner.nextInt();
        System.out.print("Enter the number of balls per over: ");
        int balls = scanner.nextInt();

        System.out.println("Enter (-1) to give wicket :");
        System.out.println("Enter (-2) to give wide ball :");
        System.out.println("Enter (-3) to give no ball :");
        // 3D Array: innings x overs x balls
        int[][][] score = new int[2][overs][balls];
        int[] wicket = new int[2];
        int run = 0;
        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter the data of team " + teamNames[i] + " :");
            wicket[i] = 0;
            for (int j = 0; j < score[i].length; j++) {
                System.out.println("Enter data of " + (j + 1) + " over in inning of team " + teamNames[i] + " :");
                for (int k = 0; k < score[i][j].length;) {
                    System.out.println("Enter run of  a " + (k + 1) + "ball in " + (j + 1) + " over : ");
                    run = scanner.nextInt();
                    if (run == -1) {
                        wicket[i]++;
                        run = 0;
                        k++;
                    } else if (run == -2) {
                        run = 1;
                    } else if (run == -3) {
                        run = 1;
                    } else if (run >= 0 && run <= 10) {
                        score[i][j][k] += run;
                        k++;
                    }
                }
            }
        }
        System.out.println("\nLive Cricket Score:");
        for (int i = 0; i < score.length; i++) {
            int totalScorePerInning = 0;
            for (int j = 0; j < score[i].length; j++) {
                int totleRunPerOver = 0;
                for (int k = 0; k < score[i][j].length; k++) {
                    totleRunPerOver += score[i][j][k];
                }
                totalScorePerInning += totleRunPerOver;
            }
            System.out.println("The totle run Score board of team " + teamNames[i] + " is " + totalScorePerInning + "/ "
                    + wicket[i] + " (" + overs + ") :");
        }

    }
}