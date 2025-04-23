package Divide_and_Conquer;
import java.util.*;
public class mergeSort {
    public static void printArr(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void mergeSortAlo(int[] array, int si, int ei) {
        // Base Case
        if (si >= ei) {
            return;
        }
        // kam
        int mid = si + (ei - si) / 2;  // mid = (si + en) / 2
        mergeSortAlo(array, si, mid);  // Left part
        mergeSortAlo(array,mid + 1, ei);  // Right part
        merge(array, si, mid, ei);
    }
    public static void merge(int[] array, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si;  // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0;  // iterator for temp array

        while (i <= mid && j <= ei) {
            if (array[i] < array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }

        // left part
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        // right part
        while (j <= ei) {
            temp[k++] = array[j++];
        }

        // copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            array[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter array element size : ");
        int num = sc.nextInt();
        System.out.print("Please enter an array element value : ");
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
          array[i] = sc.nextInt();
        }
        mergeSortAlo(array, 0, array.length - 1);
        printArr(array);
    }
}
