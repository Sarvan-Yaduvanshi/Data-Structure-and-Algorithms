package RECURSION;
import java.util.*;
public class tilingProblem {
    public static int calculateTotalNoOfWays(int n) { // 2 * n (floor size)
        // Base Case
        if (n == 0 || n == 1) {
            return 1;
        }
        return calculateTotalNoOfWays(n - 1) + calculateTotalNoOfWays(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a floor size : ");
        int size = sc.nextInt();
        System.out.println("The no of total ways : " + calculateTotalNoOfWays(size));
    }
}
