package Hashing;
import java.util.*;
public class  majorityElement {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
//            if (map.containsKey(arr[i])) {
//                map.put(arr[i], map.get(arr[i]) + 1);
//            } else {
//                map.put(arr[i], 1);
//            }
            // ShortCut
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

//        Set<Integer> keySet = map.keySet();  -->  ShortCut --> for (map.keySet())
        for (Integer key : map.keySet()) {
            if (map.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }
    }
}
//  Time complexity is O(n), but space complexity is also O(n), which could be optimized.
