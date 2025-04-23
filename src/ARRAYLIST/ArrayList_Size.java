package ARRAYLIST;
import java.util.ArrayList;
public class ArrayList_Size {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(list.size());
        // Print the ArrayList
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
