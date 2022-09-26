class Solution {
    public int findLucky(int[] arr) {
        int res = -1;
        int n = arr.length;
        if (arr == null || n == 0)
            return res;
        
        int[] freqarr = new int[501]; // the max length is 500
        int m = freqarr.length;
        for (int i = 0; i < n; i++) {
            freqarr[arr[i]]++; // increment each elements in the freqarr
        }
        
        for (int i = m - 1; i >= 1; i--) { // iterate from the end
            if (freqarr[i] == i) // find the max element from the end, which equals condtions of the lucky integer
                return freqarr[i];
        }
        
        return res;
    }
}