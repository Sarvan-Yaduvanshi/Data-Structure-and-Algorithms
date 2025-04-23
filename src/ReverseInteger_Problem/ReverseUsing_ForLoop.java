package ReverseInteger_Problem;
import java.util.*;
public class ReverseUsing_ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int lastDigit = 0;
        for (; num > 0; num /= 10) {
            int remainder = num % 10;
            lastDigit = (lastDigit * 10) + remainder;
        }
        System.out.println("Reverse number = " + lastDigit);
    }
}
