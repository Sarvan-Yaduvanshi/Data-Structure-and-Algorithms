package Basic_Problem_In_Java;
import java.util.*;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }
//        for (int i = 1; i <= num; i++) { Time Complexity => O(n)
//            sum += i;
//        }

        int sum = (num * (num + 1)) / 2; // Time Complexity => O(1)
        System.out.println("Sum of first " + num + " natural numbers : " + sum);
    }
}
