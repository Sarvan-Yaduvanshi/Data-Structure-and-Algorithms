package Hashing;
import java.util.*;
public class iteratorOnHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        cities.add("Delhi");
        cities.add("Bihar");

        // 1st method
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("<---------------->");
        // 2nd method
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
