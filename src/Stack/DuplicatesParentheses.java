package Stack;
import java.util.*;
public class DuplicatesParentheses {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Closing
            if (ch == ')') {
                int count = 0;
                while (s.pop() != '(') {
                    count++;
                }
                if (count < 1) {
                    return true;  // duplicate
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string parentheses expression : ");
        String str = sc.nextLine();
        System.out.println("The given string parentheses expression is : " + isDuplicate(str));
    }
}
