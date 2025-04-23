
/*    Given a signed 32-bit integer x, return x with its digits reversed.
      If reversing x causes the value to go outside the signed 32-bit integer
      range [-231, 231 - 1], then return 0.

      Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

        Example 1:
            Input: x = 123
            Output: 321
        Example 2:
            Input: x = -123
            Output: -321
        Example 3:
            Input: x = 120
            Output: 21
        Constraints:
        -231 <= x <= 231 - 1

 */

package ReverseInteger_Problem;
import java.util.*;
public class ReverseInteger_LeetCode {
    public static int reverse(int num) {
        int reversed = 0;

        while (num != 0) {
            int remainder = num % 10;

            // Check for overflow before updating reversed
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && remainder > 7)) {
                return 0; // Overflow for positive numbers
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && remainder < -8)) {
                return 0; // Overflow for negative numbers
            }

            reversed = (reversed * 10) + remainder;
            num /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(reverse(num));
    }
}

