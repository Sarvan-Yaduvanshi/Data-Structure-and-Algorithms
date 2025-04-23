package ReverseInteger_Problem;
import java.util.*;

public class ReverseAndCheckPrime {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false; // Numbers less than 2 are not prime
        if (num == 2 || num == 3) return true; // 2 and 3 are prime
        if (num % 2 == 0 || num % 3 == 0) return false; // Divisible by 2 or 3

        for (int i = 5; i * i <= num; i += 6) { // Check divisibility for numbers of the form 6k ± 1
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }

    // Function to reverse a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to reverse and check for prime: ");
        int num = scanner.nextInt();

        int reversedNum = reverseNumber(num);
        System.out.println("Reversed Number: " + reversedNum);

        if (isPrime(reversedNum)) {
            System.out.println("The reversed number is a prime number.");
        } else {
            System.out.println("The reversed number is not a prime number.");
        }

        scanner.close();
    }
}
