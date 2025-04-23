package Hashing;
import java.util.*;
public class createHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insert  --> O(1)
        map.put("India", 100);
        map.put("China", 150);
        map.put("USA", 110);
        map.put("AUS", 90);
        System.out.println(map);

        // Get --> O(1)
        System.out.println(map.get("India"));
        System.out.println(map.get("Bihar"));  // output : null because bihar not insert table

        // ContainsKey -->  O(1)
        System.out.println(map.containsKey("India"));  // true
        System.out.println(map.containsKey("Bihar"));  // false

        // remove --> O(1)
        System.out.println(map.remove("China"));
        System.out.println(map);

        // Size
        System.out.println(map.size());

        // isEmpty
        System.out.println(map.isEmpty());

        // clear
        map.clear();
        System.out.println(map.isEmpty());
    }
}
