class Solution {
    public int longestContinuousSubstring(String str) {
        int n = str.length(), len = 1, res = 0;
        for(int i = 1; i < n; i++){
            if(str.charAt(i) == str.charAt(i - 1) + 1)
                len ++;
            else{
                res = len > res ? len : res;
                len = 1;
            }
        }
        res = len > res ? len : res;
        return res;
    }
}