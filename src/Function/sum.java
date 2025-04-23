package Function;
import java.util.*;
public class sum {
    public static int calculateSum(int num1, int num2) { // parameters or formal parameter
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter a 2nd Number : ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);  // arguments or actual parameters
        System.out.print("The sum of two number : " + sum);

    }
}
