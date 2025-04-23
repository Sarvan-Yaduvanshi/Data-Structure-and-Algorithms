/*
                           -: Fibonacci series in Java :-
   In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8,
   13, 21, 34, 55 etc.The first two numbers of fibonacci series are 0 and 1.
   Input: N = 10
   Output: 0 1 1 2 3 5 8 13 21 34
   Explanation: Here first term of Fibonacci is 0 and second is 1, so that 3rd term = first(o) + second(1)
   etc and so on.
 */

package Basic_Problem_In_Java;
import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Term : ");
        int num = sc.nextInt();
        int num1 = 0, num2 = 1;
        for ( int i = 0; i < num; i++) {
            System.out.println("Your Fibonacci Series is : " + num1);
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

    }
}


//      <============>   Time Complexity o(n)    <=============>
//      <============>   Auxiliary Space o(1)    <=============>
