/**
 * BRUTE FORCE
 * Two passes through the array
 * TC - O(n)
 * SC - O(1)
 */
class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = largestElement(arr);
        return secondLargestElement(arr, largest);
    }
    
    public int largestElement(int[] arr){
        int largest = -1;
        for(int i : arr){
            if(i > largest) largest = i;    
        }
        
        return largest;
    }
    
    public int secondLargestElement(int[] arr, int largest){
        int secondLargest = -1;
        for(int i : arr){
            if(i > secondLargest && i != largest) secondLargest = i;
        }
        
        return secondLargest;
    }
}

/**
 * OPTIMAL
 * One pass through the array
 * TC - O(n)
 * SC - O(1)
 */
class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        if(n == 1) return -1;
        
        int largest = -1;
        int secondLargest = -1;
        
        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] != largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        
        return largest == secondLargest ? -1 : secondLargest;
    }
}