package DYNAMIC_PROGRAMMING.FibonacciNumber;
import java.util.*;
public class FiboNum_M1 {

    static int calFibonacciNum(int num) {

        if (num == 0 || num == 1) return num; // Base case

        int[] dp = new int[num + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= num; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[num];
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.print("The fibonacci number " +  num + "th is : "+ calFibonacciNum(num));
    }
}
