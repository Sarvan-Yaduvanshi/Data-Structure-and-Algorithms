package Basic_Problem_In_Java;
import java.util.*;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {

        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) result.add("FizzBuzz");
            if (i % 3 == 0) result.add("Fizz");
            if (i % 5 == 0) result.add("Buzz");
            result.add(Integer.toString(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = sc.nextInt();
        FizzBuzz fb = new FizzBuzz();
        List<String> result = fb.fizzBuzz(num);

        // Print the result
        for (String s : result) {
            System.out.print("[" + s + "]");
        }
    }
}
/*
public class FizzBuzz {
    public void fizzBuzz(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            StringBuilder temp = new StringBuilder();
            if (i % 3 == 0) temp.append("Fizz");
            if (i % 5 == 0) temp.append("Buzz");
            if (temp.length() == 0) temp.append(i); // Neither Fizz nor Buzz
            result.append("[").append(temp).append("] ");
        }
        System.out.println(result.toString().trim()); // Print all results in one go
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = sc.nextInt();
        FizzBuzz fb = new FizzBuzz();
        fb.fizzBuzz(num);
    }
}
 */
