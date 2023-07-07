public class buy_sell_stock_121 {


        public int maxProfit(int[] prices) {

            int max = 0;
            int min = prices[0];

            for(int i=1;i<prices.length;i++)
            {
                if(min < prices[i])
                    max = Math.max(prices[i]-min,max);
                else
                    min = prices[i];
            }

            System.gc();

            return max;
        }

}
