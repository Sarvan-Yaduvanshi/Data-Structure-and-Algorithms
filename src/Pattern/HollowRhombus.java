/*
                 * * * * *
               *       *
             *       *
           *       *
         * * * * *
 */
package Pattern;
import java.util.*;
public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a number : ");
        int num = sc.nextInt();
        // outer loop
        for ( int i = 1; i <= num; i++) {
            // inner loop ---> space print
            for ( int j = 1; j <= num -i; j++) {
                System.out.print(" ");
            }
            // Hollow Rectangle =======>
            for (int j = 1; j <= num; j++) {
                if (i == 1 || j == 1 || i == num || j == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
