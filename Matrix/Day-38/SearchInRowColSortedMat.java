class Solution {
    public static boolean matSearch(int mat[][], int x) {
        int n = mat.length, m = mat[0].length;
        int row = 0, col = m-1;
        
        while(row < n && col >= 0){
            if(x > mat[row][col]){
                row++;
            }
            else if(x < mat[row][col]){
                col--;
            }
            else return true;
        }
        return false;
    }
}