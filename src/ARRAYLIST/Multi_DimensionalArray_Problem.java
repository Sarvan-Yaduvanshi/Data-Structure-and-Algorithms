package ARRAYLIST;
import java.util.*;
public class Multi_DimensionalArray_Problem {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list.add(i);       // 1 2 3 4 5
            list2.add(i * 2);  // 2 4 6 8 10
            list3.add(i * 3);  // 3 6 9 12 15
        }
        mainList.add(list);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        // Print 2D ArrayList
        for (ArrayList<Integer> currList : mainList) {
            for (Integer integer : currList) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
