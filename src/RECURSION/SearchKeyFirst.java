package RECURSION;
import java.util.*;
public class SearchKeyFirst {
    public static int SearchKey(int[] array, int key, int i) {
        // Base Case
        if (i == array.length) {
            return -1;
        } if (array[i] == key) {
            return i;
        }
        return SearchKey(array, key, i + 1);
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
        int index = SearchKey(array, key, 0);
        if (index == -1) {
            System.out.println("Key Not Found");
        } else {
            System.out.println("Key is at index : " + index);
        }
    }
}
