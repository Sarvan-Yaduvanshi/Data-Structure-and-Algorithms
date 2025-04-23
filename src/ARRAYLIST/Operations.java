package ARRAYLIST;
import java.util.ArrayList;
public class Operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add One by One Element ----> Time Complexity O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.add(1, 9);  // Time Complexity O(n) Particular element per ja kr add
        System.out.println(list);

        // Get Element  ------->  Time Complexity O(1)
//        int element = list.get(2);
//        System.out.println(element);

        // Delete Element  ------>  Time Complexity O(n)
//        list.remove(2);
//        System.out.println(list);

        // Set Element at Index  ------>  Time Complexity O(n)
//        list.set(2, 10);
//        System.out.println(list);

        // Contain Element  ------->  Time Complexity O(n)
//        System.out.println(list.contains(1));
//        System.out.println(list.contains(11));


    }
}
