package ARRAYLIST.PairsSum;
import javax.xml.transform.stax.StAXResult;
import java.util.*;
public class TwoPointer2 {
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        for (int i = 0; i< list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) { // Breaking Point
                bp = i;
                break;
            }
        }
        int n = list.size();
        int lp = bp + 1;  // Smallest
        int rp = bp;      // Largest
        while (lp != rp) {
            //  Case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // Case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                // Case 3
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Sorted and Rotated Array
        // 11 15 6 8 9 10
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairSum2(list, target));
    }
}
