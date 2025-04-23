package Basic_Problem_In_Java;
import java.util.*;

public class PrimeNumber {
    public static boolean checkPrime(int num) {

        if (num < 2) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 6; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int num = sc.nextInt();

        if (checkPrime(num)) {
            System.out.println("It is prime number");
        } else {
            System.out.println("It is not prime number");
        }
    }
}
