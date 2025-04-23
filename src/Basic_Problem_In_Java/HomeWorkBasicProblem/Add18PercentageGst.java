package Basic_Problem_In_Java.HomeWorkBasicProblem;
import java.util.*;
public class Add18PercentageGst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Income: ");
        double income = sc.nextDouble();

        // Call a method to calculate final income after tax deduction
        calculateIncomeAfterTax(income);

        sc.close(); // Close the scanner to avoid resource leaks
    }

    private static void calculateIncomeAfterTax(double income) {
        double taxRate;
        double tax;

        // Determine tax rate based on income brackets
        if (income < 500000) {
            taxRate = 0.0; // No tax
        } else if (income < 1000000) {
            taxRate = 0.20; // 20% tax
        } else {
            taxRate = 0.30; // 30% tax
        }

        // Calculate tax and remaining income
        tax = taxRate * income;
        double finalIncome = income - tax;

        // Display the results
        System.out.println("Your Total Income = " + income);
        System.out.println("Tax Rate Applied = " + (taxRate * 100) + "%");
        System.out.println("Calculated Tax = " + tax);
        System.out.println("Income After Tax Deduction = " + finalIncome);
    }
}

