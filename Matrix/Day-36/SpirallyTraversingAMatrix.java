class Solution {
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        int row = mat.length;
        int col = mat[0].length;
        ArrayList<Integer> res = new ArrayList<>();
        int uprow = 0, downrow = row-1, leftcol = 0, rightcol = col-1;
        
        while(uprow <= downrow && leftcol <= rightcol){
            // printing the upper row
            for(int i = leftcol; i <= rightcol; i++){
                res.add(mat[uprow][i]);
            }
            uprow++;
            
            // printing the right column
            for(int i = uprow; i <= downrow; i++){
                res.add(mat[i][rightcol]);
            }
            rightcol--;
            
            // printing the bottom row with condition
            if(uprow <= downrow){
                for(int i = rightcol; i >= leftcol; i--){
                    res.add(mat[downrow][i]);
                }
                downrow--;
            }
            
            // printing the left column with condition
            if(leftcol <= rightcol){
                for(int i = downrow; i >= uprow; i--){
                    res.add(mat[i][leftcol]);
                }
                leftcol++;
            }
        }
        
        return res;
    }
}