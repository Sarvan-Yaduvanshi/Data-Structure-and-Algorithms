package Backtracking;
import java.util.*;
public class subSets {
    public static void findSubsets(String str,String ans, int i) {
        // Base Case
        if (i == str.length()) {
            if (ans.isEmpty()) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
       // Choice Yes
        findSubsets(str,ans + str.charAt(i), i + 1);
        // No Choice
        findSubsets(str, ans, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string : ");
        String str = sc.nextLine(); 
        findSubsets(str, "", 0);
    }
}
