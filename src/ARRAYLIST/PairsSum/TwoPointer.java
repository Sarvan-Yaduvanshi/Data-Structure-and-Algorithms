package ARRAYLIST.PairsSum;
import java.util.*;
public class TwoPointer {
    public static boolean sumPairs(ArrayList<Integer> list, int target) {
        int lp = 0; int rp = list.size() - 1;
        while (lp != rp) {
            // Case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // Case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1 2 3 4 5 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 10;
        System.out.println(sumPairs(list, target));
    }
}
