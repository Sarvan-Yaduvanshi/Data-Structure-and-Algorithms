package RECURSION;
import java.util.*;
public class Fibonacci {
    public static int calculateFibonacciNum(int num) {
        // Base Case
        if (num == 0 || num == 1) {
            return num;
        }
        return calculateFibonacciNum(num - 1) + calculateFibonacciNum(num - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int num = sc.nextInt();
       System.out.print("The Fibonacci Number is : " + calculateFibonacciNum(num));
    }
}
