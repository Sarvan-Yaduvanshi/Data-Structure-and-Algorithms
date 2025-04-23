package Stack;
import java.util.*;
public class validParentheses {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {  // Opening Brackets
                s.push(ch);
            } else {
                // Closing Brackets
                if (s.isEmpty()) {
                    return false;
                }
                if (s.peek() == '(' && ch == ')'  // ()
                        || s.peek() == '{' && ch == '}' // {}
                        || s.peek() == '[' && ch == ']') {  // []
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string parentheses : ");
        String str = sc.nextLine();
        System.out.println(isValid(str));
    }
}
