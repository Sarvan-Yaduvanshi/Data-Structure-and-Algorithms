package Function;
import java.util.*;
public class factorial {
    public static int calculateFact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int fact = calculateFact(num);
        System.out.print("The factorial is " + num + "! : " + fact);

    }
}
