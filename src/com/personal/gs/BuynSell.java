package com.personal.gs;

public class BuynSell {
    public static void main(String[] args) {
        profit(new int[]{7, 1, 4, 8, 9});
    }

    private static void profit(int[] stockPrice) {
        int maxProfit=0;
        int minPrice = Integer.MAX_VALUE;
        for(int i =0; i< stockPrice.length; i++){
            if(minPrice>stockPrice[i]){
                minPrice= stockPrice[i];
            }
            if(maxProfit > minPrice - stockPrice[i]){
                maxProfit= stockPrice[i]-minPrice;
            }
            System.out.println(maxProfit+":"+minPrice);
        }

       /* if (minPrice > stockPrices[i]) {
            minPrice = stockPrices[i];
        } else if (minPrice - stockPrices[i] < maxProfit) {
            maxProfit =  stockPrices[i]-minPrice;
        }
*/
    }
}
