class Solution {
    public boolean isPerfectSquare(int n) {
//         si = Starting index ,ei = ending index
        long si = 0;
        long ei = n;
        while(si <= ei){
            long mid = si + (ei - si) /2;
            long res = mid * mid;
            if(res == n){
                return true;
            }
            else if(res > n){
                ei = mid - 1;
            }
            else{
                si = mid + 1;
            }
        }
        return false;
    }
}