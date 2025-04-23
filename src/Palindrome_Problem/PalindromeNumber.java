package Palindrome_Problem;
import java.util.*;
public class PalindromeNumber {
    public static boolean isPalindrome(int num) {

        int originalNum= num;
        int reversedNumber = 0;
        while (num > 0) {
            int remainder = num % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            num /= 10;
        }
        return originalNum == reversedNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        System.out.println(num + (isPalindrome(num) ? " is Palindrome" : " is not Palindrome"));
    }
}
