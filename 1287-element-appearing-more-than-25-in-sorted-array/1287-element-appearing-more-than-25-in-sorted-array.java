class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int more = n / 4;
        for(int i = 0; i < n; i ++){
            if(n == 1){
                return arr[i]; 
            }
            if(arr[i] == arr[i + more]){
                return arr[i];
            }
        }
        return 1;
    }
}