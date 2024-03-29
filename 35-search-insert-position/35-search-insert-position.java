class Solution {
    public int searchInsert(int[] arr, int target) {
        int n = arr.length;
//         si = Starting index , ei = ending index
        int si = 0, ei = n - 1;
        while(si <= ei){
        int mid = si + (ei - si) / 2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            ei = mid - 1;
        }
        else{
            si = mid + 1;
            }
        }
        return si;
    }
}