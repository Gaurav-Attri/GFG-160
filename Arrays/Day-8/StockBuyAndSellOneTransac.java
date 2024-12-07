/**
 * OPTIMAL
 * TC - O(n)
 * SC - O(1)
 */
class Solution {
    public int maximumProfit(int prices[]) {
        int n = prices.length;
        int maxProfit = 0;
        int minPriceSoFar = prices[0];
        
        for(int i = 1; i < n; i++){
            if(prices[i] > minPriceSoFar){
                maxProfit = Math.max(maxProfit, prices[i]-minPriceSoFar);
            }
            else{
                minPriceSoFar = prices[i];
            }
        }
        
        return maxProfit;
        
    }
}