package RECURSION;
import java.util.*;
public class removeDuplicates {
    public static void removeDuplicatesInString(String str, int idx, StringBuilder newStr, boolean[] map) {
       // Base Case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // kam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            // duplicate
            removeDuplicatesInString(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicatesInString(str, idx + 1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string : ");
        String str = sc.nextLine();
       removeDuplicatesInString(str, 0, new StringBuilder(" "), new boolean[26]);
    }
}
