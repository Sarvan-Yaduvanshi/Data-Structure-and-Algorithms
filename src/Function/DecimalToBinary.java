package Function;
import java.util.*;
public class DecimalToBinary {
    public static void DecToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while ( n > 0) {
            int rem = n % 2;
            binNum = binNum + ( rem * (int)Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.print("Binary of " + myNum +" = " + binNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal number : ");
        int num = sc.nextInt();
        DecToBin(num);
    }
}
