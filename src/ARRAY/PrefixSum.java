package ARRAY;
import java.util.*;
public class PrefixSum {
    public static void calculateOfPrefixSum(int[] num) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[num.length];
        prefix[0] = num[0];
        for ( int i = 1; i < num.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }
        for ( int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum is : " +maxSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Total Element of Array : ");
        int number = sc.nextInt();
        System.out.println("Please Enter Array Element Values : ");
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }
        calculateOfPrefixSum(arr);

    }
}
