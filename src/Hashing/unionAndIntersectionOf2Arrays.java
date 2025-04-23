package Hashing;
import java.util.*;
public class unionAndIntersectionOf2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        // To store union elements
        HashSet<Integer> unionSet = new HashSet<>();

        // Adding elements of first array to unionSet
        for (int arr : arr1) {
            unionSet.add(arr);
        }
        // Adding elements of second array to unionSet
        for (int arr : arr2) {
            unionSet.add(arr);
        }
        // Printing Union Elements and Count
        System.out.println("Union of the two arrays: " + unionSet);
        System.out.println("The Union count of elements = " + unionSet.size());

        // To store intersection elements
        List<Integer> intersectionList = new ArrayList<>();
        unionSet.clear();
        // Adding elements of first array to the set
        for (int arr : arr1) {
            unionSet.add(arr);
        }

        // Checking intersection with second array
        for (int arr : arr2) {
            if (unionSet.contains(arr)) {
                intersectionList.add(arr);  // Add to intersection list
                unionSet.remove(arr);  // Ensure each element is added only once
            }
        }

        // Printing Intersection Elements and Count
        System.out.println("Intersection of the two arrays: " + intersectionList);
        System.out.println("The intersection count of elements = " + intersectionList.size());
    }
}
