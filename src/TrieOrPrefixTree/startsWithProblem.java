package TrieOrPrefixTree;
import java.util.*;
public class startsWithProblem {
    static class Node {
        Node[] children = new Node[26];
        boolean endOfWord = false;
        int freq;

        Node() {
            // Children array is initialized to null by default in Java
            freq = 1;  // Frequency starts at 1 because this node is being visited
        }
    }

    public static Node root = new Node();

    // Function to insert a word into the Trie
    public static void insert(String word) {  // O(L) where L is the length of the word
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.endOfWord = true;  // Mark the end of a word
    }

    public static boolean startsWith(String prefix) {

        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }

        return true;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "app", "mango", "man", "woman"};
        String prefix1 = "app";
        String prefix2 = "moon";
        String prefix3 = "man";

        for (String word : words) {
            insert(word);
        }

        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));
        System.out.println(startsWith(prefix3));
    }
}
