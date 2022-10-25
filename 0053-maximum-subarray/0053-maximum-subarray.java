class Solution {
    public int maxSubArray(int[] arr){
        int n = arr.length;
        int msa = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
            if(arr[i] > sum){
                sum = arr[i];
            }
            if(sum > msa){
                msa = sum;
            }
        }
        return msa;
    }
}