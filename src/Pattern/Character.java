/*
      A        |  1
      B C      |  2 3
      D E F    |  4 5 6
      G H I J  |  7 8 9 10
 */
package Pattern;
import java.util.*;
public class Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your Number of character : ");
        int num = sc.nextInt();
        char ch = 'A';
        int number = 1;
        for  ( int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
//                System.out.print(ch);
//                ch++;
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

    }
}
