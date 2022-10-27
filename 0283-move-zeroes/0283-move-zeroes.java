class Solution {
    public void swap(int arr[],int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int itr = 0;
        int pt = -1;
        while(itr < n){
            if(arr[itr] != 0){
                swap(arr, itr, ++pt);
            }
            itr ++;
        }
    }
}