package Backtracking;
import java.util.*;
public class Permutations {
    public static void calculatePermutations(String str, String ans) {
        // Base Case
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        // Recursion -  O(n * n!) Time Complexity
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde" ==> "ab" + "de" = "abde"
            String newStr = str.substring(0, i) + str.substring(i + 1);
            calculatePermutations(newStr, ans + curr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string : ");
        String str = sc.nextLine();
        calculatePermutations(str, "");
    }
}
