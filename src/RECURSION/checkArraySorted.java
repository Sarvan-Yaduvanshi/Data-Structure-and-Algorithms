package RECURSION;
import java.util.*;
public class checkArraySorted {
    public static boolean calculateArraySorted(int[] array, int i) {
        // Base Case
        if (i == array.length - 1) {
            return true;
        }
        if (array[i] > array[i + 1]) {
            return false;
        }
        return calculateArraySorted(array, i + 1);

    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Array Element Size : ");
        int num = sc.nextInt();
        System.out.print("Please Enter Array Element Value : ");
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(calculateArraySorted(array, 0));
    }
}
