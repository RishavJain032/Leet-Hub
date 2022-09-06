class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
//         si = Starting index , ei = Ending index;
        int si = 0 , ei = n - 1;
        if(arr[si] <= arr[ei]){
//             if arr is not rotated or rotated upto n then
            return arr[0];
        }
        while(si <= ei){
        int mid = (si + ei)/2;
        if(arr[mid] > arr[mid + 1]){
            return arr[mid + 1];
            }
            else if(arr[mid] < arr[mid - 1]){
                return arr[mid];
            }
            else if(arr[si] <= arr[mid]){
                si = mid + 1;
            }
            else if(arr[mid] <= arr[ei]){
                ei = mid - 1;
            }
        }
        return -1;
    }
}