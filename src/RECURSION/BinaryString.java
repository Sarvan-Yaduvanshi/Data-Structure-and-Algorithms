package RECURSION;
import java.util.*;
public class BinaryString {
    public static void calculateBinaryString(int num, int lastPlace, String str) {
        // Base Case
        if (num == 0) {
            System.out.println(str);
            return;
        }
        // kam
        calculateBinaryString(num - 1, 0, str +"0");
        if (lastPlace == 0) {
            calculateBinaryString(num - 1, 1, str +"1");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = sc.nextInt();
        calculateBinaryString(num, 0, "");
    }
}
