package TrieOrPrefixTree;
import java.util.*;
public class PrefixProblem {
    static class Node {
        Node[] children = new Node[26];
        boolean endOfWord = false;
        int freq;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
                freq = 1;
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
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.endOfWord = true;   // Mark the end of a word
    }

    public static void findPrefix(Node root, String ans) {  // O(L) L is Longest word

        // Base Case
        if (root == null) return;
        // if freq == 1 means not next not unique character
        if (root.freq == 1) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                findPrefix(root.children[i], ans + (char) (i + 'a') );
            }
        }
    }
    public static void main(String[] args) {
        String[] words = {"zebra", "dog", "duck", "dove"};

        for (String word : words) {
            insert(word);
        }

        root.freq = -1;
        findPrefix(root, "");
    }

}
