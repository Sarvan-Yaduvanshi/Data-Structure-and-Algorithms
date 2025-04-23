package ReverseInteger_Problem;
import java.util.*;
public class isPalindromeString {
    public static boolean checkPalindromeString(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        String str = sc.next();

        if (checkPalindromeString(str)) {
            System.out.println(str + " is Palindrome ");
        } else {
            System.out.println(str + " is not Palindrome");
        }
    }
}
