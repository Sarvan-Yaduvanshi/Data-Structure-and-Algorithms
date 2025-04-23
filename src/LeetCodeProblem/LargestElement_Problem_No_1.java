package LeetCodeProblem;
import java.util.*;
public class LargestElement_Problem_No_1 {
    public static int largestElement(int[] array) {
        int largest = Integer.MIN_VALUE;
        int smallest  = Integer.MAX_VALUE;
        for (int j : array) {
            if (j > largest) {
                largest = j;
            }
            if (j < smallest) {
                smallest = j;
            }
        }
        System.out.println("The largest value is : " + largest);
        return smallest;
    }
    public static void main(String[] args) {
        int[] size = new int[50];
        int[] array = {12, 13, 2, 25, 27, 83, 37};
        int result = largestElement(array);
        System.out.println("The smallest value is : " + result);
    }
}
