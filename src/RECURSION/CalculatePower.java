package RECURSION;
import java.util.*;
public class CalculatePower {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a base : ");
        int base = sc.nextInt();
        System.out.print("Please Enter a Power : ");
        int power = sc.nextInt();
        System.out.println("Your x power n is : " + power(base, power));
    }
}
