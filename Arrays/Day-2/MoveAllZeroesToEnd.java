// BRUTE FORCE
// TC -> O(n)
// SC -> O(1)
class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        if(n == 1) return;
        
        int prev = 0;
        int next = 1;
        
        while(prev < n && next < n){
            int prevEle = arr[prev];
            int nextEle = arr[next];
            
            if((prevEle != 0 && nextEle != 0) || (prevEle != 0 && nextEle == 0)){
                prev++;
                next++;
            }
            else if(prevEle == 0 && nextEle != 0){
                arr[prev] = nextEle;
                arr[next] = prevEle;
                prev++;
                next++;
            }
            else{
                next++;
            }
        }
    }
}

// Approach 2
// TC -> O(2n), SC -> O(1)
// A little cleaner than the previous one (though it takes two passes)

class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }
        }
        for(int i = count; i < n; i++) arr[i] = 0;
    }
}

// Best Approach
// TC -> O(n)
// SC -> O(1)
// Similar to my brute force but WAYYY more cleaner!
class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int count = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
}