package Basic_Problem_In_Java;
import java.util.*;
public class CheckPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("Zero is neither positive or negative");
        } else if (num > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }
}
