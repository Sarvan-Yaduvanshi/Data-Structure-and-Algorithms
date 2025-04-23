/*
 Print Right Triangle --------->

          *                         1
          * *   ---> print("*")     1 2         ======> print(j)
          * * *                     1 2 3
          * * * *                   1 2 3 4
          * * * * *                 1 2 3 4 5
 */
package Pattern;
import java.util.*;
public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("[Please Enter a Number :");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
