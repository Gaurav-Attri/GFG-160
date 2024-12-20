/**
 * BRUTE
 * TC - O(n)
 * SC - O(1)
 */
class Solution {
    public void sort012(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;
        int n = arr.length;
        
        for(int num : arr){
            if(num == 0) count0++;
            else if(num == 1) count1++;
            else count2++;
        }
        
        
        int index = 0;
        for(int i = 0; i < count0; i++) arr[index++] = 0;
        for(int i = 0; i < count1; i++) arr[index++] = 1;
        for(int i = 0; i < count2; i++) arr[index++] = 2;
    }
}

/**
 * OPTIMAL
 * DNF Algo - Dutch National Flag algorithm, used for linearly sorting three objects.
 * TC - O(n)
 * SC - O(1)
 */
class Solution {
    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sort012(int[] arr) {
        int n = arr.length;
        int low = 0, mid = 0, high = n-1;

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1) mid++;
            else{
                swap(arr, mid, high);
                high--;
            }
        }
    }
}