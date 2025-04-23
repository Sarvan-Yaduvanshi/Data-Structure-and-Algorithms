package Stack;
import java.util.*;
public class reverseStack {
    public static void pushABottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushABottom(stack, data);
        stack.push(top);
    }
    public static void reverseAStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        reverseAStack(stack);
        pushABottom(stack, top);
    }
    // Print Stack
    public static void printStack(Stack<Integer> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        // 5, 4, 3, 2, 1
        reverseAStack(stack);
        printStack(stack);
        // 1, 2, 3, 4, 5
    }
}
