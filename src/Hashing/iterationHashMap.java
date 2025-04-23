package Hashing;
import java.util.*;
public class iterationHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("China", 150);
        map.put("USA", 50);
        map.put("Indonesia", 6);
        map.put("Nepal", 5);

        // Iterate
        // map.entrySet()
        Set<String> keys = map.keySet();
        System.out.println(keys);
        for (String key : keys) {
            System.out.println("Key = " + key + ", Value = " + map.get(key));
        }
    }
}
