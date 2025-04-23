package GreedyAlgorithms;
import java.util.*;
public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int W = 50;

        double[][] ration = new double[val.length][2];
        // oth col => idx; 1st col => ratio

        for (int i = 0; i < val.length; i++) {
            ration[i][0] = i;
            ration[i][1] = val[i] / (double) weight[i];
        }

        // ascending order
        Arrays.sort(ration, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalValue = 0;
        for (int i = ration.length - 1; i >= 0; i--) {
            int idx = (int)ration[i][0];
            if (capacity>= weight[idx]) {  // include Full item
                finalValue += val[idx];
                capacity -= weight[idx];
            } else {
                // include fractional item
                finalValue += (int) (ration[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("Final value = " + finalValue);
    }
}
