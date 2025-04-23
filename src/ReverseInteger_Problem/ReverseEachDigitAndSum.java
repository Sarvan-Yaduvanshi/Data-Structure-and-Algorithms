package ReverseInteger_Problem;
import java.util.*;
public class ReverseEachDigitAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int reversed = 0;
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reversed = (reversed * 10) + lastDigit;
            sum += lastDigit;
            num /= 10;
        }
        System.out.println("The reversed : " + reversed);
        System.out.println("The sum of the reversed digits : " + sum);
    }
}
