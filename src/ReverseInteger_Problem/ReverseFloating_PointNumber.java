package ReverseInteger_Problem;
import java.util.*;
public class ReverseFloating_PointNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Floating-Pint number : ");
        String num = sc.next();

        String[] parts = num.split("\\."); // Split into integer and decimal parts
        String reversed = new StringBuilder(parts[0]).reverse().toString();

        if (parts.length > 1) {
            reversed += "." + new StringBuilder(parts[1]).reverse().toString();
        }

        System.out.println("Reversed number : " + reversed);
    }
}
