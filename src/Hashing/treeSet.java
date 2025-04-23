package Hashing;
import java.util.*;
public class treeSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        cities.add("Delhi");
        cities.add("Bihar");
        System.out.println(cities);

        // Using LinkedHashSet
        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("Mumbai");
        linked.add("Noida");
        linked.add("Bengaluru");
        linked.add("Delhi");
        linked.add("Bihar");
        System.out.println(linked);

        // Using TreeSet
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Mumbai");
        treeSet.add("Noida");
        treeSet.add("Bengaluru");
        treeSet.add("Delhi");
        treeSet.add("Bihar");
        System.out.println(treeSet);
    }
}
