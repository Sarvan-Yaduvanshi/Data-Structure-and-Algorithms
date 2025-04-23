package Hashing;

public class validAnaGram1 {
    public static boolean isAnagram(String s, String t) {
        // Early return if lengths are different
        if (s.length() != t.length()) return false;

        // Create an array for character counts
        int[] charCount = new int[26];

        // Count characters in the first string
        for (char ch : s.toCharArray()) {
            charCount[ch - 'a']++; // Increment the count for character ch
        }

        // Decrease counts for characters in the second string
        for (char ch : t.toCharArray()) {
            charCount[ch - 'a']--; // Decrement the count for character ch
            // If count goes below zero, t has an extra character
            if (charCount[ch - 'a'] < 0) {
                return false;
            }
        }

        return true; // If all counts are zero, they are anagrams
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
      Second Code:
        Time Complexity: O(n) for both strings, as it still requires iterating through each
        string once. However, the operations are more efficient with the fixed-size array.
        Space Complexity: O(1) since the size of the character count array does not depend
        on the input size.
 */
