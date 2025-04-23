/*
        *             *
        * *         * *
        * * *     * * *
        * * * * * * * *
        * * * * * * * *
        * * *     * * *
        * *         * *
        *             *
 */
package Pattern;
import java.util.*;
public class Butterefly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a number : ");
        int num = sc.nextInt();
        // 1st part of the code
        for ( int i = 1; i <= num; i++) {
            //  i ---> star print
            for ( int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 2 * (n - i) ---> space print
            int space = 2 * ( num - i);
            for ( int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // i ---> star print
            for ( int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd part of the code
        for ( int i = num; i >= 1; i--) {
            //  i ---> star print
            for ( int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 2 * (n - i) ---> space print
            int space = 2 * ( num - i);
            for ( int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // i ---> star print
            for ( int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
