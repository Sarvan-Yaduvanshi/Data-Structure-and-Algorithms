package TrieOrPrefixTree;
import java.util.*;
public class LongestWordWithAllPrefix {
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

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) return;

        for (int i = 0; i < 26; i++) { // a, b, c, d  ==> ans = apple but (ans = apply for (int i= 25; i >= 0; i--))
            if (root.children[i] != null && root.children[i].endOfWord == true) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);  // backtrack
            }
        }
    }
    public static void main(String[] args) {
        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        for (String word : words) {
            insert(word);
        }

        longestWord(root, new StringBuilder(" "));
        System.out.println(ans);
    }
}
