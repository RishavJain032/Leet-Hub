class Solution {
    public void swap(int arr[] ,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sortColors(int[] arr) {
        int n = arr.length;
        int itr = 0, pt1 = -1, pt2 = n - 1;
        while(itr <= pt2){
            if(arr[itr] == 0){
                swap(arr,itr ++, ++ pt1);
            }
            else if(arr[itr] == 1){
                itr ++;
            }
            else {
                swap (arr, pt2--, itr);
            }
        }
    }
}
