package DSA.Arrays.OneD;

import java.util.Scanner;

public class BuyAndSellStocks {

    public static int buySellStocks(int[] price){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0;i< price.length;i++){
            if(buyPrice<price[i]){
                // profit tab milta hai jab hum jab buyprice kam ho aur sell price jyada ho
                int profit = price[i]- buyPrice; //
                maxProfit = Math.max(maxProfit,profit); // max profit nikalane ke liye
            }
            else {
                buyPrice = price[i]; // buy price update karo
            }
        }
        return maxProfit;
    }

    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[]  price = new int[n];
        for(int i=0;i<price.length;i++){
            price[i]= scanner.nextInt();
        }
        System.out.println(buySellStocks(price));
    }
}
