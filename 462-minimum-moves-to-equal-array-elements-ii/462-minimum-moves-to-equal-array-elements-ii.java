class Solution {
    public int minMoves2(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
	    int res = 0;
        int mid = arr[n / 2];
	    for(int i : arr){ 
            res = res + Math.abs(mid - i);
        }
	    return res;
    }
}