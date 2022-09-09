class Solution {
    public boolean search(int[] arr, int target) {
        int n = arr.length;
//         si = starting index,ei = ending index
     int si = 0, ei = n - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (target == arr[mid]){
                return true;
            }
            if (arr[si] < arr[mid]) {
                if (target < arr[si] || target > arr[mid]){
                    si = mid + 1;
                } 
                else ei = mid - 1;
            } 
            else if (arr[si] > arr[mid]) {
                if (target < arr[mid] || target > arr[ei]){
                    ei = mid - 1;
                } else si = mid + 1;

            } else si++;
        }

        return false;
    }
}
