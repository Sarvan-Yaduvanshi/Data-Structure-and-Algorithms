/*
             *           1
           * *         2 1
         * * *       3 2 1
       * * * *     4 3 2 1
     * * * * *   5 4 3 2 1
 */
package Pattern;
import java.util.*;
public class HalfPyramid_rotated180deg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a number : ");
        int num = sc.nextInt();
        // outer loop
        for ( int i = 1; i <= num; i++) {
            // inner loop ---> space
            for ( int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // inner loop print star
            for ( int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
