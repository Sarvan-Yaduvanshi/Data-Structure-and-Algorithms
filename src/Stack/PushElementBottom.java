package Stack;
import java.util.*;
public class PushElementBottom {
    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a data push at bottom : ");
        int n = sc.nextInt();

        pushAtBottom(stack, n);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
