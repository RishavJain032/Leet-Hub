class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
//         si = Starting index, ei = ending index
        int si = 0, ei = n - 1;
        int arr1[] = new int[2];
        while (si < ei) {
            int sum = arr[ei] + arr[si];
            if (sum == target) {
                arr1[0] = si + 1;
                arr1[1] = ei + 1;
                return arr1;
            } 
            else if (sum < target){
                si = si + 1;
            } 
            else {
                ei = ei - 1;
            }
        }
        return arr1;
    }
}