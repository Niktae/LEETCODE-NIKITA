public class Solution {
    public int MaxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.Length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else{
                profit=Math.Max(profit,prices[i]-min);
            }
        }
        return profit;
        
    }
}