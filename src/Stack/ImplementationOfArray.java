package Stack;
import java.util.*;
public class ImplementationOfArray {
    public static class Stack {
        int size = 10000;
        int[] array = new int[size];
        int top = -1;
        // Push Operation
        void push(int x) {
            top ++;
            array[top] = x;
        }

        // Pop Operation
        int pop() {
            int x = array[top];
            top--;
            return x;
        }

        // Top or Peek Operation
        int top() {
            return array[top];
        }

        // Size Operation
        int size() {
            return top + 1;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println("Top of the stack before deleting any element : " + s.top());
        System.out.println("Size of stack before deleting any element : " + s.size());
        System.out.println("The element deleted is : " + s.pop());
        System.out.println("Size of the stack after deleting an element : " + s.size());
        System.out.println("Top of the stack after deleting any element : " + s.top());
    }
}
