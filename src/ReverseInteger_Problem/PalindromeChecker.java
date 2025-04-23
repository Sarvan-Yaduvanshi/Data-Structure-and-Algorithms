package ReverseInteger_Problem;
import java.util.Scanner;

public class PalindromeChecker {
    // Optimized function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        if (num < 0) return false; // Negative numbers can't be palindromes

        int original = num;
        int reversed = 0;

        while (num > 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(num + " is " + (isPalindrome(num) ? "a palindrome." : "not a palindrome."));
        sc.close();
    }
}
