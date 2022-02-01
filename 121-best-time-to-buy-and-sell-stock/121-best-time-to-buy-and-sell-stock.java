class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(profit<prices[i]-min)
            {
                profit=prices[i]-min;
            }
            if(min>prices[i])
            {
                min=prices[i];
            }
        }
        return profit;
    }
}