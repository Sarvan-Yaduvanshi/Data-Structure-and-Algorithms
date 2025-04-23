package Stack;
import java.util.*;
public class HistogramRectangle {
    public static void maxArea(int[] array) {  // O(N) optimized code
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        int[] nsr = new int[array.length];
        int[] nsl = new int[array.length];

        // Next smaller right = O(n)
        for (int i = array.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && array[s.peek()] >= array[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = array.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Next smaller left  = O(n)
        s = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            while (!s.isEmpty() && array[s.peek()] >= array[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Current Area : Width = j - i - 1 = nsr[i] - nsl[i] - 1  = O(n)
        for (int i = 0; i < array.length; i++) {
            int height = array[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("Max area histogram = " + maxArea);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number of histogram bar : ");
        int n = sc.nextInt();
        System.out.print("Please enter a histogram height : ");
        int[] heights = new int[n];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextInt();
        }
        maxArea(heights);
    }
}
