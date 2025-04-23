package ReverseInteger_Problem;
import java.util.*;
public class ReverseNegativeInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        boolean isNegative = num < 0;
        if (isNegative) num = -num;

        int revered = 0;
        while (num != 0) {
            int remainder = num % 10;
            revered = (revered * 10) + remainder;
            num /= 10;
        }

        if (isNegative) revered = -revered;
        System.out.println("The reversed number =" + revered);
    }
}
