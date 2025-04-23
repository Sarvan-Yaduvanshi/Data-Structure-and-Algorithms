package Basic_Problem_In_Java;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int num = sc.nextInt();
        int reverse = 0;
        int newNum = num;
        while ( num > 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num /= 10;
        }
        System.out.print("The reverse " + newNum +" is : " + reverse);
    }
}
