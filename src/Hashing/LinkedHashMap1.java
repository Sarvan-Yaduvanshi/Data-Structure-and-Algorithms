package Hashing;
import java.util.LinkedHashMap;

public class LinkedHashMap1 {
    public static void main(String[] args) {
       LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("India", 100);
        map.put("China", 150);
        map.put("Indonesia", 50);
        map.put("Nepal", 40);
        System.out.println(map);
    }
}

// <=========> LinkedHashMap use order maintain <===========>
