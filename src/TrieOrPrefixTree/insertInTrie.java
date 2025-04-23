package TrieOrPrefixTree;
import java.util.*;
public class insertInTrie {
    static class Node {
        Node[] children = new Node[26];
        boolean endOfWord = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {  // O(L)
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.endOfWord = true;   // Mark the end of a word
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.endOfWord;
    }

    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any", "thee"};

        // Insert words into the Trie
        for (String word : words) {
            insert(word);
        }

        System.out.println(search("there"));
        System.out.println(search("thor"));
    }
}
