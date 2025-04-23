package ARRAYLIST;
import java.util.ArrayList;
public class MaximumValue {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(4);
        list.add(5);
        // Print Maximum Value In Array ------>  Time Complexity O(n)
        int max = Integer.MIN_VALUE;
        for (Integer integer : list) {
//            if (max < integer) {
//                max = integer;
//            }
            max = Math.max(max, integer);
        }
        System.out.println("The maximum element in array is : " + max);

    }
}
