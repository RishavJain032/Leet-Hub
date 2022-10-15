class Solution {
 public boolean divideArray(int[] arr) {
     int n = arr.length;
        int[] freq = new int[501];
        for(int i = 0; i < n; i++){
            freq[arr [i]] ++;
        }

        for(int i: freq)
            if(i % 2 != 0)
                return false;

        return true;
    }
}