class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        if(n == 0)
            return false;
        // si = staring index;
        // ei = ending index;
        int si = 0;
        int ei = (n * m) - 1;
        while(si <= ei){
        int mid = si + (ei - si) / 2;
        if(matrix[mid / m][mid % m] == target)
            return true;
            
            if(matrix[mid / m] [mid % m] < target)
                si = mid + 1;
        else
            ei = mid - 1;
        }
        return false;
    }
}