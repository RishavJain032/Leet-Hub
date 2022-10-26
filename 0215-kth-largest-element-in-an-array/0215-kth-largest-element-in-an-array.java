class Solution {
    public int findKthLargest(int[] arr, int k) {
        int n = arr.length;
         Arrays.sort(arr);
            int[] res = new int[n];
            int ans = 0;
            for(int i = n - 1; i >= 0;i --){
                res[i] = arr[ans];
                ans ++;
            }            
            return res[k - 1];
    }
}
