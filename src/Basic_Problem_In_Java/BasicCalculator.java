package Basic_Problem_In_Java;
import java.util.*;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" 1 --> Add\n 2 --> Subtraction\n 3 --> Multiplication\n 4--> Division\n");
        System.out.print("Please choice the operation : ");
        int operation = sc.nextInt();
        System.out.print("Please enter a first number : ");
        int a = sc.nextInt();
        System.out.print("Please enter a second number : ");
        int b = sc.nextInt();
        switch (operation) {
            case 1 : int sum = a + b; {System.out.println("The sum of two number is : " + sum); break;}
            case 2 : int sub = a - b; {System.out.println("The subtraction of two number is : " + sub); break;}
            case 3 : int multiply = a * b; {System.out.println("The multiplication of two number is : " + multiply); break;}
            case 4 : if (b == 0) {
                System.out.println("The Division is not possible ");
            } else {
                int division = a / b;
                {
                    System.out.println("The division of two number is : " + division);
                    break;
                }
            }
        }
    }
}
