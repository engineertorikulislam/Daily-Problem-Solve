package daily_problem_solve;

import java.util.Scanner;

public class N_series_Sum_for_loop {

    public static void main(String[] args) {
        int i, n, sum = 0;
        System.out.println("Enter your last series :");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (i = 1; i <= n; ++i) {
            sum = sum + i;
        }
        System.out.println("1 to " + n + " series sum is :" + sum);
    }
}
