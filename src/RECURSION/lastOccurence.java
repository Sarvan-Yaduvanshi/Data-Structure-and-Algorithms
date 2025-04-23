package RECURSION;
import java.util.*;
public class lastOccurence {
    public static int lastOccurenceKey(int[] array, int key, int i) {
        // Base Case
        if (i == array.length) {
            return -1;
        }
        int isFound = lastOccurenceKey(array, key, i + 1);
        if (isFound == -1 && array[i] == key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Array Element Size : ");
        int num = sc.nextInt();
        System.out.print("Please Enter a Array Element Value : ");
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Please Enter a Key for search element : ");
        int key = sc.nextInt();
        int index = lastOccurenceKey(array, key, 0);
        if (index == -1) {
            System.out.println("Key Not Found");
        } else {
            System.out.println("Key is at index : " + index);
        }
    }
}
