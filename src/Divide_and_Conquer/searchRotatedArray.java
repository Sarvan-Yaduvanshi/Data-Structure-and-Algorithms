package Divide_and_Conquer;
import java.util.*;
public class searchRotatedArray {
    public static int searchInRotatedArray(int[] array, int target, int si, int ei) {
        // Base Case
        if (si > ei) {
            return -1;
        }
        // kam
        int mid = si + (ei - si) / 2;
        // Case FOUND
        if (array[mid] == target) {
            return mid;
        }
        // mid-on Line1
        if (array[si] <= array[mid]) {
            // Case a : Left
            if (array[si] <= target && target <= array[mid]) {
                return searchInRotatedArray(array, target, si, mid - 1);
            } else {
                // Case b : Right
                return searchInRotatedArray(array, target, mid + 1, ei);
            }
        }
        // mid-on Line2
        else {
            // Case c : right
            if (array[mid] <= target && target <= array[ei]) {
                return searchInRotatedArray(array, target, mid + 1, ei);
            } else {
                // Case d : left
                return searchInRotatedArray(array, target, si, mid - 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an array element size : ");
        int num = sc.nextInt();
        System.out.print("Please enter an array element value  : ");
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Please enter a target for search index : ");
        int target = sc.nextInt();
        System.out.println("Target at index is : " + searchInRotatedArray(array, target, 0, array.length - 1));
    }
}
