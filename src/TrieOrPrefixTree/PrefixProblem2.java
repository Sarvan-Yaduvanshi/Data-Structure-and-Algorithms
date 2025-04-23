package TrieOrPrefixTree;
import java.util.*;
public class PrefixProblem2 {
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
    public static List<String> prefixes = new ArrayList<>();  // List to store prefixes

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

    // Function to find unique prefixes for all words
    public static void findPrefix(Node root, String ans) {  // O(L) where L is the longest word

        // Base Case: if root is null or the frequency is 1, we have found a unique prefix
        if (root == null) return;

        if (root.freq == 1) {
            prefixes.add(ans);  // Store the unique prefix in the list
            return;
        }

        // Recursively explore all possible children nodes
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                findPrefix(root.children[i], ans + (char) (i + 'a'));
            }
        }
    }

    public static void main(String[] args) {
        String[] words = {"zebra", "dog", "duck", "dove"};

        // Insert all words into the Trie
        for (String word : words) {
            insert(word);
        }

        // Set root frequency to -1 to indicate it's not a part of any word
        root.freq = -1;

        // Find unique prefixes
        findPrefix(root, "");

        // Print the prefixes in the desired format
        System.out.println(prefixes);  // Output as a list format
    }
}

/*
      Time Complexity:
            Inserting a word into the trie takes O(L) time, where L is the length of the word.
            Inserting n words will take O(n * L) in total, where n is the number of words
            and L is the average word length.
           * Finding prefixes also takes O(L) time per word in the worst case.
      Space Complexity:
           O(26 * L * n) for the trie, where 26 is the size of the alphabet, L is the average word
           length, and n is the number of words.
 */
