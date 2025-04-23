package Stack;
import java.util.*;
public class nextGreaterElement {
    public static void main(String[] args) {
        int[] array = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int[] nextGreater = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            //  1 While
            while (!s.isEmpty() && array[s.peek()] <= array[i]) {
                s.pop();
            }

            // 2 if-else
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = array[s.peek()];
            }

            // 3 Push in s
            s.push(i);
        }

        for (int j : nextGreater) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

// Next Greater Right
// Next Greater Left
// Next Small Right
// Next small left

