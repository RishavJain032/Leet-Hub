class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> res  = new ArrayList<>();
         int n = matrix.length, m = matrix[0].length, left = 0, right = m - 1, top = 0, bottom = n - 1, dirn = 0;
        //  0 : left to right;
        //  1 : top to bottom; 
        //  2 : rigth to left;
        //  3 : bottom to top;
        while (left <= right && top <= bottom){
            if(dirn % 4 == 0){
                for(int i = left; i <= right; i++){
                    res.add(matrix[top][i]);
                }
                dirn ++;
                top ++;
            }
            else if(dirn % 4 == 1){
                for(int i = top; i <= bottom; i++){
                    res.add(matrix[i][right]);
                }
                dirn ++;
                right --;
            }
            else if(dirn % 4 == 2){
                for(int i = right; i >= left; i--){
                    res.add(matrix[bottom][i]);
                }
                dirn ++;
                bottom --;
            }
            else if(dirn % 4 == 3){
                for(int i = bottom; i >= top; i--){
                    res.add(matrix[i][left]);
                }
                dirn ++;
                left ++;
            }
        }
       return res;
    }
}