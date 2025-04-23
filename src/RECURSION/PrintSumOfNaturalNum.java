package RECURSION;
import java.util.*;
public class PrintSumOfNaturalNum {
    public static int calculateSum(int num) {
        if (num == 1) {
            return 1;
        }
        calculateSum(num - 1);
        return num + calculateSum(num - 1);
    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Please Enter a NUmber : ");
       int num = sc.nextInt();
       System.out.println("Total Sum is : " + calculateSum(num));
   }
}
