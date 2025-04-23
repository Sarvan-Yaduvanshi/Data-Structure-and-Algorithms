/*
             *
            ***
           *****
          *******
          *******
           *****
            ***
             *
 */
package Pattern;
import java.util.*;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a number : ");
        int num = sc.nextInt();
        //  =======> upper half
        for ( int i = 1; i <= num; i++) {
            // space print
            for ( int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // star print
            for ( int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // =========> 2nd half ========>
        for ( int i = num; i >= 1; i--) {
            // space print
            for ( int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // star print
            for ( int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
