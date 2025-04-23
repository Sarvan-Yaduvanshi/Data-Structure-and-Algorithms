package Function;
import java.util.*;
public class basic {
    public static boolean isPalindrome(int num) {

        int originalNum = num;
        int reversed = 0;
        while (num > 0) {
            int remainder = num % 10;
            reversed = (reversed * 10) + remainder;
            num /= 10;
        }
        return originalNum == reversed;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }
}