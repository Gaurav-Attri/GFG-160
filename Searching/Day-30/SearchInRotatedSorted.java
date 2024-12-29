class Solution {
    int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;
        
        while(low <= high){
            int mid = (low+high)/2;
            
            if(arr[mid] == key) return mid;
            
            // find out the sorted half
            // left half is sorted
            if(arr[low] <= arr[mid]){
                // if element lies in the left half
                if(key >= arr[low] && key <= arr[mid]) high = mid - 1;
                // else the element must lie in the right half if it exists
                else low = mid + 1;
            }
            // right half is sorted
            else{
                // if element lies in the right half
                if(key >= arr[mid] && key <= arr[high]) low = mid + 1;
                // else the element must lie in the left half if it exists
                else high = mid - 1;
            }
        }
        return -1;
    }
}