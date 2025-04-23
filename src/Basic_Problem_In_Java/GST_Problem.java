package Basic_Problem_In_Java;
import java.util.*;
public class GST_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a pencil price : ");
        float pencil = sc.nextFloat();

        System.out.print("Enter a pen price : ");
        float pen = sc.nextFloat();

        System.out.print("Enter a eraser price : ");
        float eraser = sc.nextFloat();

        float cost = pencil + pen + eraser;
        System.out.println("Your Total Bill without GST = " + cost);

        float totalCost = cost + (0.18f * cost);
        System.out.print("Your Total Bill with 18% GST = " + totalCost);
    }
}
