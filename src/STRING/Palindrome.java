package STRING;
import java.util.*;
public class Palindrome{
    public static boolean isPalindrome(String str) {
        for ( int i = 0; i < str.length()/2; i++) {
            int n = str.length();
            if ( str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a String : ");
        String str = sc.nextLine();
        boolean result = isPalindrome(str);
        if(result) {
            System.out.println("The String \"" + str + "\" is a palindrome. ");
        } else {
            System.out.println("The String \"" + str + "\" is a not palindrome.");
        }
    }
}