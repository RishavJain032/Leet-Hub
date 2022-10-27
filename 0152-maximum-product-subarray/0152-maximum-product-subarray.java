class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int res = arr[0], pmax = arr[0], pmin = arr[0];
        for(int i = 1; i < n; i ++){
            if(arr[i] < 0){
                int temp = pmax;
                pmax = pmin;
                pmin = temp;
            }
            pmax = Math.max(arr[i], pmax * arr[i]);
            pmin = Math.min(arr[i], pmin * arr[i]);
            res = Math.max(res, pmax);
        }
        return res;
    }
}