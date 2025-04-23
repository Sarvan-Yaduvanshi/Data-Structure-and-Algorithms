package ReverseInteger_Problem;
import java.util.*;
public class ReverseAnInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = sc.nextInt();
        System.out.println("The number of before reverse = " + num);

        int lastDigit = 0;
        while (num != 0) {
            int remainder = num % 10;
            lastDigit = (lastDigit * 10) + remainder;
            num /= 10;
        }
        System.out.print("The reverse of number = " + lastDigit);
    }
}
