/**
 * BETTER
 * TC - O(n)
 * SC - O(1)
 */
class Solution {
    static int maxProduct(int[] arr) {
        int n = arr.length;
        int currMax = arr[0];
        int currMin = arr[0];
        int maxProd = arr[0];
        
        for (int i = 1; i < n; i++) {
            
            int temp = max(arr[i], arr[i] * currMax, arr[i] * currMin);
            currMin = min(arr[i], arr[i] * currMax, arr[i] * currMin);
            currMax = temp;
            maxProd = Math.max(maxProd, currMax);
        }

        return maxProd;
    }
    
    static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}