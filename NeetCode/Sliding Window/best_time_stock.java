class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int profit = 0;
        int max = 0;
        while(sell < prices.length){
            profit = prices[sell] - prices[buy];

            if(profit >= max){
                max = profit;
            }
            else if(prices[sell] < prices[buy]){

                buy = sell;
            }


                sell++;
        }

        return max;
    }
}