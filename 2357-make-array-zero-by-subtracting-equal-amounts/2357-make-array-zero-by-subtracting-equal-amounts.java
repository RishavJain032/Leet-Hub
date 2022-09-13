class Solution {
     public int getFirst(int[] nums) {
        int si = 0, ei = nums.length - 1, ans = -1;
        while(si <= ei) {
            int mid = si + (ei - si) / 2;
            if(nums[mid] == 0){
                si = mid + 1;
            }
            else {
                ans = mid;
                ei = mid - 1;
            }
        }
        return ans;
    }
    public int minimumOperations(int[] nums) {
     int n = nums.length, count = 0;
        Arrays.sort(nums);
        while(nums[n - 1] != 0) {
            count ++;
            int ele = nums[getFirst(nums)];
            for(int i = 0; i < n; i ++) {
                if(nums[i] != 0) {
                    nums[i] -= ele;
                }
            }
        }
        return count;
    }
}