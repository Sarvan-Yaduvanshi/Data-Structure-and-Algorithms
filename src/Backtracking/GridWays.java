package Backtracking;
import java.util.*;
public class GridWays {
    public static int calGridWays(int i, int j, int n, int m) {
        // Base Case
        if (i == n - 1 && j == m - 1) { // condition for last call
            return 1;
        } else if (i == n || j == n) {  // boundary cross condition
            return 0;
        }
        int w1 = calGridWays(i + 1, j , n, m);
        int w2 = calGridWays(i, j + 1, n, m);
        return w1 + w2;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(calGridWays(0,0, n, m));
    }
}
