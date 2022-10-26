class Solution {
    public void merge(int[] arr, int m, int[] arr1, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while(i >= 0 && j >= 0){
            if(arr[i] > arr1[j]){
                arr[k] = arr[i];
                i --;
            }
            else{
                arr[k] = arr1[j];
                j--;
            }
            k --;
        }
            while(j >= 0){
                arr[k] = arr1[j];
                j--;
                k--;
        }
    }
}
