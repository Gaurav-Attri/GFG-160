/**
 * OPTIMAL
 * TC - O(n)
 * SC - O(1)
 */
class Solution {
    public int maximumProfit(int prices[]) {
        int n = prices.length;
        if(n == 1) return 0;
        
        int maxProfit = 0;
        int previousPrice = -1;
        
        for(int i = 0; i < n; i++){
            int currentPrice = prices[i];
            if(i == n-1){
                if(previousPrice != -1 && currentPrice > previousPrice){
                    maxProfit += currentPrice - previousPrice;
                }
                break;
            }
            int nextPrice = prices[i+1];
            
            if(currentPrice > nextPrice && previousPrice != -1){
                maxProfit += currentPrice - previousPrice;
                previousPrice = -1;
            }
            else if(currentPrice <= nextPrice && previousPrice == -1){
                previousPrice = currentPrice;
            }
        }
        
        return maxProfit;
    }
}

/**
 * MORE READABLE
 * TC - O(n)
 * SC - O(1)
 */
class Solution {
    public int maximumProfit(int prices[]) {
        int n = prices.length;
        if(n == 1) return 0;
        
        int maxProfit = 0;
        
        for(int i = 0; i < n-1; i++){
            if(prices[i] < prices[i+1]) maxProfit += (prices[i+1]-prices[i]);
        }
        
        return maxProfit;
    }
}