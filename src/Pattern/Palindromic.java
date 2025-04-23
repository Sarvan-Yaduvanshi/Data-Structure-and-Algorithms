/*
            1
           212
          32123
         4321234
        543212345
 */
package Pattern;
import java.util.*;
public class Palindromic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a number : ");
        int num = sc.nextInt();
        // outer loop
        for ( int i = 1; i <= num; i++) {
            // inner loop ---> space print
            for ( int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // inner loop ---> star print for backwards
            for ( int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // inner loop  ---> star print forwards
            for ( int j = 2; j <= i; j++ ) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
