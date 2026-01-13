package ICP1.Day_01_13_Jan_2026;

import java.util.Scanner;

public class Buy_and_Sell_Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int minCost = Integer.MAX_VALUE;
        int profit = 0;

        for(int val : prices){
            minCost = Math.min(val,minCost);
            profit = Math.max(profit,val - minCost);
        }
        return profit;
    }
}