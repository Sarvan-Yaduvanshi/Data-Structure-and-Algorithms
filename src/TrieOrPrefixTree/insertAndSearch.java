package TrieOrPrefixTree;
import java.util.*;
public class insertAndSearch {
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

    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any", "thee"};

        // Insert words into the Trie
        for (String word : words) {
            insert(word);
        }

        // Test search
        String[] searchWords = {"the", "these", "their", "any", "a", "there", "thee"};
        for (String word : searchWords) {
            System.out.println("Searching for '" + word + "': " + search(word));
        }
    }
}

/*
    Time and Space Complexity:
            Time Complexity: Both insert and search still operate in O(L), where L is the length
                             of the word being inserted or searched.

            Space Complexity: Each node maintains an array of size 26, so space complexity is
                              proportional to the number of nodes, which is proportional to the total
                              number of characters inserted into the Trie.
 */
