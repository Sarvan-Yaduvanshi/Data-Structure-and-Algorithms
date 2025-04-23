package TrieOrPrefixTree;
import java.util.*;
public class countUniqueSubstrings {
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

    public static int countNode(Node root) {
        if (root == null) return 0;

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNode(root.children[i]);
            }
        }

        return count + 1;
    }

    public static void main(String[] args) {
        String str = "ababa";  // ans = 10
//        String str = "apple";  // ans = 15

        // suffix -->  insert in trie
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countNode(root));
    }
}
