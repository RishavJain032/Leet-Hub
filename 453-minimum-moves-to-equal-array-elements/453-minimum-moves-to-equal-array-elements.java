class Solution {
    public int minMoves(int[] arr) {
     int res = 0;
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            if(min > i){
                min = i;
            }
        }
        
        for(int i : arr){
            res += (i - min);
        }
        
        return res;
    }
}   