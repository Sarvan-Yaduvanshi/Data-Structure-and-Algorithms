package RECURSION;
import java.util.*;
public class FactorialNumber {
    public static int Factorial(int num) {
        if (num == 0) {
           return 1;
        }
        int fact = Factorial(num - 1);
        return num * fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int num = sc.nextInt();
        int fact = Factorial(num);
        if (fact < 0) {
            System.out.println("Error");
        } else {
            System.out.println("Your Factorial is : " + fact);
        }
    }
}

// <===========>  Time  Complexity O(N)  <===============>
// <===========>  Space Complexity O(N)  <===============>
