package com.personal.ds.util.array;

public class ArrayBuynSell {
    public static void main(String[] args) {
        int[] stockPrices = {7, 1, 4, 8, 9};
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < stockPrices.length; i++) {
            if (minPrice > stockPrices[i]) {
                minPrice = stockPrices[i];
            } else if (minPrice - stockPrices[i] < maxProfit) {
                maxProfit =  stockPrices[i]-minPrice;
            }
        }
        System.out.println("Min Price:"+minPrice);
        System.out.println("Max Profit:"+ maxProfit);
    }
}
