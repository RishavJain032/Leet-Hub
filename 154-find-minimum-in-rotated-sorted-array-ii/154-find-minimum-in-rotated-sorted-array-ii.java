class Solution {
    public int findMin(int[] arr){
        int n = arr.length;
        int si = 0;
        int ei = n - 1;
        if(arr[si] < arr[ei]){
            return arr[0];
        }
        while(si < ei){
            int mid = (si + ei) / 2;
          if(arr[mid] > arr[ei]){
           si = mid + 1;   
          }
            else if (arr[mid] < arr[si]){
                ei = mid;
            }
            else {
                ei--;
            }
        }
        return arr[si];
    }
}