/*
       * * * * *    1 2 3 4
       * * * * *    1 2 3 4
       * * * * *    1 2 3 4
       * * * * *    1 2 3 4
 */
package Pattern;
import java.util.*;
public class solidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a number : ");
        int num = sc.nextInt();
        for ( int i = 1; i <= num; i++) {
            for ( int j = 1; j <= num; j++) {
//                System.out.print("*");
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
