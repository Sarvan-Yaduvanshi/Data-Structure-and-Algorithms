package Basic_Problem_In_Java;
import java.util.*;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c, f;
        System.out.print("Please Enter a Temperature in Fahrenheit : ");
        f = sc.nextDouble();
        c = (5.0 / 9.0) * (f - 32);
        System.out.print("Temperature in Celsius : " + c);
    }
}
