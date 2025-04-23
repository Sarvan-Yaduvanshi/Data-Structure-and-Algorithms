package Function;
import java.util.*;
public class BinomialCoff{
    public static int  calculateFact(int n) {
        int fact = 1;
        for ( int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int calculateBinCoff( int n, int r) {
        int fact_n = calculateFact(n);
        int fact_r = calculateFact(r);
        int fact_nmr = calculateFact(n - r);
        return fact_n / (fact_r * fact_nmr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n : ");
        int n = sc.nextInt();
        System.out.print("Enter a number r : ");
        int r = sc.nextInt();
        int BinomialCoefficient = calculateBinCoff(n, r);
        System.out.print("The Binomial Coefficient is : " + BinomialCoefficient);
    }
}
