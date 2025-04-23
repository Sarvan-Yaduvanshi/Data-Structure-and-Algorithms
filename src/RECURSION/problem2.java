package RECURSION;
import java.util.*;
public class problem2 {
    public static void printIncreasingNum(int num) {
        if (num == 1) {
            System.out.print(1 + " ");
            return;
        }
        printIncreasingNum(num - 1);
        System.out.print(num + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int num = sc.nextInt();
        printIncreasingNum(num);

    }
}
