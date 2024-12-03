// When you're revising it, make sure you find out why the JUGGLIN algorithm works (which btw you haven't coded in this file!)

// BRUTE FORCE
// TC - O(n)
// SC - O(n)
class Solution {
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        if(d%n == 0) return;
        
        d = d%n;
        int[] temp = new int[n];
        
        int index = 0;
        for(int i = d; i < n; i++) temp[index++] = arr[i];
        for(int i = 0; i < d; i++) temp[index++] = arr[i];
        for(int i = 0; i < n; i++) arr[i] = temp[i];
    }
}

// OPTIMAL
// TC - O(n)
// SC - O(1)
class Solution {
    static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        if(d%n == 0) return;
        
        d = d%n;
        
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }
}