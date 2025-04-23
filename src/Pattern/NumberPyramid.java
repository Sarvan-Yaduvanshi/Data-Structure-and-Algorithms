/*
                1
               2 2
              3 3 3
             4 4 4 4
            5 5 5 5 5
 */
package Pattern;
import java.util.*;
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a number : ");
        int num = sc.nextInt();
        for ( int i = 1; i <= num; i++) {
            // space print
            for ( int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for ( int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
