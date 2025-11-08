import java.util.Scanner;

class RowSumThread extends Thread {
    int row[];
    int index;

    RowSumThread(int row[], int index) {
        this.row = row;
        this.index = index;
    }

    public void run() {
        int sum = 0;
        for (int val : row) sum += val;
        System.out.println("Sum of Row " + index + " = " + sum);
    }
}

public class ThreadDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        for (int i = 0; i < m; i++) {
            RowSumThread t = new RowSumThread(matrix[i], i);
            t.start();
        }
        sc.close();
    }
}
