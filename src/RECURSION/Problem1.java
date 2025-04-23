package RECURSION;
import java.util.*;
public class Problem1 {
    public static void Recursion(int num) {
        if (num == 1) {
            System.out.println(num);
            return;
        }
        System.out.print(num + " ");
        Recursion(num - 1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int num = sc.nextInt();
        Recursion(num);
    }
}
