// BRUTE FORCE, O(n^2) both time and space complexities
class Solution {
    static void rotateby90(int mat[][]) {
        int n = mat.length;
        int row = 0, col = n-1;
        int temp[][] = new int[n][n];
        
        while(row < n){
            // copy the current column from original mat to temp mat
            for(int i = 0; i < n; i++){
                temp[row][i] = mat[i][col];
            }
            row++;
            col--;
        }
        
        // copy the temp mat in original mat
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = temp[i][j];
            }
        }
    }
}

// OPTIMAL, O(n^2) time and constant space
class Solution {
    static void rotateby90(int mat[][]) {
        int n = mat.length;
        
        // Reversing the matrix row-wise
        for(int[] arr : mat){
            int i = 0, j = n-1; 
            while(i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        
        // Transposing the matrix
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}