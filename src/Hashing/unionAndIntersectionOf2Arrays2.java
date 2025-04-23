package Hashing;
import java.util.*;
public class unionAndIntersectionOf2Arrays2 {
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        // To store union and intersection elements
        HashSet<Integer> set = new HashSet<>();

        // Adding elements from both arrays to the set to calculate union
        for (int arr : arr1) {
            set.add(arr);  // Add all elements of arr1
        }

        for (int arr : arr2) {
            set.add(arr);  // Add all elements of arr2
        }

        // Printing Union Elements and Count
        System.out.println("Union of the two arrays: " + set);
        System.out.println("The Union count of elements = " + set.size());

        // Now calculating the intersection
        // Clear the set to reuse for intersection logic
        set.clear();
        for (int arr : arr1) {
            set.add(arr);  // Add all elements of arr1 to the set
        }

        System.out.print("Intersection of the two arrays: ");
        int intersectionCount = 0;
        HashSet<Integer> intersectionSet = new HashSet<>();

        for (int arr : arr2) {
            if (set.contains(arr) && !intersectionSet.contains(arr)) {  // Check for intersection
                System.out.print(arr + " ");  // Print intersection element
                intersectionSet.add(arr);     // Avoid duplicates in intersection output
                intersectionCount++;
            }
        }

        // Printing Intersection Count
        System.out.println("\nThe intersection count of elements = " + intersectionCount);
    }
}
