package ReverseInteger_Problem;
import java.util.Scanner;

public class ReverseWithLeadingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();
        String reversed = new StringBuilder(num).reverse().toString();
        System.out.println("Reversed Number: " + reversed);
    }
}
