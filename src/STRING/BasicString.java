package STRING;
import java.util.*;
public class BasicString {
    public static void printLatter(String str) {
        for ( int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = {'H','e','l','l','o'};
        String str = "Hello";
        String str1 = new String("Hello");
        // String are Imputable in java
        System.out.print("Please Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println(name);
        // Char Length ----> .length() --> String ak Function Hai
        // Array ka Length -----> .length
        System.out.println(name.length());
        // Concatenation ---> Do Char Ko Add Karna
        String firstName = "Sarvan";
        String lastName = "Yaduvanshi";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        // Find Index in String
        System.out.println(fullName.charAt(9));
        printLatter(fullName);
    }
}
