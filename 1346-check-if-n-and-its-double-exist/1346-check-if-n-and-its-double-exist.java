class Solution {
    public boolean checkIfExist(int[] arr) {
          Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int target = 2 * arr [i];
//             si = starting index , ei = ending index;
            int si = 0;
            int ei = n - 1;
            while(si <= ei){
                int mid = si + (ei - si) / 2;
                if(arr [mid] == target && mid != i){
                    return true;
                }
                else if(arr [mid] < target){
                    si = mid + 1;
                }
                else{
                    ei = mid - 1;
                }
            }
            
        }
        return false;
    }
}
