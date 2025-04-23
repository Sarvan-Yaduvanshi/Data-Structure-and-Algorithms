package TrieOrPrefixTree;
import java.util.*;
public class WordBreakProblem {
    static class Node {
        // Number of possible characters (lowercase English alphabet)
        private static final int ALPHABET_SIZE = 26;
        Node[] children;
        boolean endOfWord;

        Node() {
            // Initialize with ALPHABET_SIZE children
            children = new Node[ALPHABET_SIZE];
            endOfWord = false;
        }
    }

    public static Node root = new Node();

    // Helper function to get index for a character
    private static int getCharIndex(char ch) {
        return ch - 'a';  // Assumes lowercase English letters
    }

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = getCharIndex(word.charAt(level));
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.endOfWord = true;
    }

    public static boolean search(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = getCharIndex(word.charAt(level));
            if (curr.children[idx] == null) {
                return false;  // Not found
            }
            curr = curr.children[idx];
        }
        return curr.endOfWord;  // Return true if it's the end of a word
    }

    public static boolean wordBreak(String key) {
        // Base Case
        if (key.length() == 0) return true;

        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] words = {"i", "like", "sam", "samsung", "mobile", "ice"};

        for (String word : words) {
            insert(word);
        }

        String key = "ilikesamsung";

        System.out.println(wordBreak(key));
    }
}
