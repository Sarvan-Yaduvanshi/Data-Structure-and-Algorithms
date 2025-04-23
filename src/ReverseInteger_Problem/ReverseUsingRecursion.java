package ReverseInteger_Problem;
import java.util.Scanner;

public class ReverseUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Reversed Number: " + reverseNumber(num, 0));
    }

    static int reverseNumber(int num, int reversed) {
        if (num == 0) {
            return reversed;
        }
        return reverseNumber(num / 10, (reversed * 10) + (num % 10));
    }
}
