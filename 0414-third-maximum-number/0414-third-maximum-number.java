class Solution {
    public int thirdMax(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        if(n < 3){
            return arr[n - 1];
        }
        int max = arr[n - 1];
        int res = 1;
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] < max){
                res ++;
               max = arr[i];
                if(res == 3){
                    return arr[i];
                }
            }
        }
        return arr[n - 1];
    }
}