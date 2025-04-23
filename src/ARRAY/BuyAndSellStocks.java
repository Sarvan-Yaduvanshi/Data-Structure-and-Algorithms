package ARRAY;
import java.util.*;
public class BuyAndSellStocks {
    public static int calculateBuyAndSellStocks(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (buyPrice < price) {  // Profit
                int profit = price - buyPrice;   // Today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Total Stock Prices : ");
        int num = sc.nextInt();
        System.out.println("Please Enter a Stock Price Values : ");
        int[] prices = new int[num];
        for ( int i = 0; i < num; i++) {
            prices[i] = sc.nextInt();
        }
        System.out.println("Your Total Stocks Maximum Profit is : " + calculateBuyAndSellStocks(prices));
    }
}
