/*
      * * * * * * *  1 2 3 4
      * * * * * *    1 2 3
      * * * * *      1 2
      * * * *        1
      * * *
      * *
      *
 */
package Pattern;
import java.util.*;
public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a number : ");
        int num = sc.nextInt();
        for ( int i = num; i >= 1; i--) {
            for ( int j = 1; j <= i; j++) {
//                System.out.print("*");
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
