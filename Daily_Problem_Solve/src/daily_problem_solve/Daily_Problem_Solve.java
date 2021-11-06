
package daily_problem_solve;

import java.util.Scanner;

/**
 * @author Md Torikul Islam
 */
public class Daily_Problem_Solve {

    public static void main(String[] args) {

        int i = 0, n;
        int sum = 0;
        System.out.println("Enter your series Number :");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("1 to " + n + "  series sum is : " + sum);

    }

}
