// Q: Write a Java program to calculate the area of triangle
// using three sides.

package Basic_Problem_In_Java;
import java.util.*;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double s, area;
        System.out.print("Please Enter a First Side Of Triangle : ");
        a = sc.nextInt();
        System.out.print("Please Enter a Second Side Of Triangle : ");
        b = sc.nextInt();
        System.out.print("Please Enter a Third Side Of Triangle : ");
        c = sc.nextInt();
        s = ( a + b + c);
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.print("The Area Of Triangle is : " + area);

    }
}
