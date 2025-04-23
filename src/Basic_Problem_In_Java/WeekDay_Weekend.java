package Basic_Problem_In_Java;
import java.util.*;
public class WeekDay_Weekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a Day Number : ");
        int day = sc.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 : {
                System.out.println("WeekDay");
                break;
            }
            case 6, 7: {
                System.out.println("Weekend");
                break;
            }
            default: {
                System.out.println("Invalid Day Number");
            }
        }
    }
}
