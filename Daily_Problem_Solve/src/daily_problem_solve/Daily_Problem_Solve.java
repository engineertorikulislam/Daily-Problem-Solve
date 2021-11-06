
package daily_problem_solve;

import java.util.Scanner;

/**
 * @author Md Torikul Islam
 */
public class Daily_Problem_Solve {

    public static void main(String[] args) {

        int n = 50;
        float sum;

        // System.out.println("Enter your series Number :");
        // Scanner input = new Scanner(System.in);
        // n = input.nextInt();

        // while (i <= n) {
        // sum += i;
        // i++;
        // }
        // System.out.println("1 to " + n + " series sum is : " + sum);

        // My Rules

        // (1+N)/2*N

        // sum = n * (n - 1) / 2;

        sum = (float) (1 + n) / 2 * n; // Time Complexity o(1)

        System.out.println(sum);

    }

}
