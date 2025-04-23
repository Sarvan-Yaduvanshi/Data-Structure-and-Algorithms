package ARRAYLIST;
import java.util.*;
public class Multi_DimensionalArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // First ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
        mainList.add(list);

        // Second ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6); list2.add(7); list2.add(8); list2.add(9); list2.add(10);
        mainList.add(list2);

        // Print 2D ArrayList
        for (ArrayList<Integer> currList : mainList) {
            for (Integer integer : currList) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}
