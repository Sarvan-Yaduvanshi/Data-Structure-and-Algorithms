package Hashing;
import java.util.*;
public class validAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1); // Decrement count
                }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String s = "race";
        String t = "care";
        String s1 = "tulip";
        String t1 = "lipid";
        String s2 = "anagram";
        String t2 = "nagaram";
        System.out.println(isAnagram(s, t));
        System.out.println(isAnagram(s1, t1));
        System.out.println(isAnagram(s2, t2));
    }
}
/*
      First Code:
         Time Complexity: O(n+m), where n is the length of string s and m is the length of string t.
         The overhead of hash map operations (insertions and lookups) can add some constant factors.
         Space Complexity:  O(n) in the worst case due to the storage in the HashMap.
 */
