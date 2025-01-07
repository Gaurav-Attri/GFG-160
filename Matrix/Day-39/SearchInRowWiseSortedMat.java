class Solution {
    public boolean searchRowMatrix(int[][] mat, int x) {
        int n = mat.length, m = mat[0].length;
        for(int[] arr : mat){
            int low = 0, high = m-1;
            while(low <= high){
                int mid = (low+high)/2;
                if(arr[mid] == x) return true;
                else if(arr[mid] < x) low = mid + 1;
                else high = mid - 1;
            }
        }
        return false;
    }
}