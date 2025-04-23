package ARRAY;
import java.util.*;
public class TrappedRainwater {
    public static int calculateTrappedRainwater(int[] height) {
        int n = height.length;
        // calculate left max boundary --- array
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for ( int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // Calculate right max boundary --array
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for ( int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // Loop
        int trappedWater = 0;
        for ( int i = 0; i < n; i++) {
            // waterLevel = min(leftMax bound, rightMax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // Trapped Water  = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Total Element of Arrays : ");
        int num = sc.nextInt();
        System.out.println("Please Enter a Trapped Rainwater Height : ");
        int[] arr = new int[num];
        for ( int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your Total Trapped Water is : " + calculateTrappedRainwater(arr));
    }
}
