/*
            * * * * *
          * * * * *
        * * * * *
      * * * * *
    * * * * *
 */
package Pattern;
import java.util.*;
public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a number : ");
        int num = sc.nextInt();
        // outer loop
        for ( int i = 1; i <= num; i++) {
            // inner loop  (n - i) ---> space print
            for ( int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // i star print
            for ( int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
