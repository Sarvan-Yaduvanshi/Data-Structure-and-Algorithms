/*
       *              1
       * *            1 2
       * * *          1 2 3
       * * * *        1 2 3 4
       * * * * *      1 2 3 4 5
       * * * * * *    1 2 3 4 5 6
 */
package Pattern;
import java.util.*;
public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your number :  ");
        int num = sc.nextInt();
        for ( int i = 1; i <= num; i++) {
            for ( int j = 1; j <= i; j++) {
//                System.out.print("*");
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
