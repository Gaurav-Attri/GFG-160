class Solution {
    
    int firstOccurrence(int[] arr, int target){
        int ans = -1, start = 0, end = arr.length-1;
        
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                ans = mid;
                end = mid - 1;
            }
            else if(arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return ans;
    }
    
    int lastOccurrence(int[] arr, int target){
        int ans = -1, start = 0, end = arr.length-1;
        
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                ans = mid;
                start = mid + 1;
            }
            else if(arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return ans;
    }
    
    int countFreq(int[] arr, int target) {
        int first = firstOccurrence(arr, target);
        if(first == -1) return 0;
        return lastOccurrence(arr, target) - first + 1;
    }
}