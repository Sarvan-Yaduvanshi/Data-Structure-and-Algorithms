package RECURSION;
import java.util.*;
public class optimizePowerCode {
    public static int optimizedPower(int a, int n) {
        // Base Case
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;
        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a base : ");
        int base = sc.nextInt();
        System.out.print("Please Enter a Power : ");
        int power = sc.nextInt();
        System.out.println("The x power n is : " + optimizedPower(base, power));
    }
}
