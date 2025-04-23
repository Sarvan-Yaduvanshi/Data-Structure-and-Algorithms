package Function;
import java.util.*;
public class product {
    public static int calculateProduct(int num1, int num2) {
        return num1 * num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter a 2nd number : ");
        int b = sc.nextInt();
        int product = calculateProduct(a, b);
        System.out.print("The product of two number : " + product);
    }
}
