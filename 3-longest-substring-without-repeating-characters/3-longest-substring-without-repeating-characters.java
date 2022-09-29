class Solution {
    public int lengthOfLongestSubstring(String str) {
        int n = str.length();
        if(n == 0){
            return 0;
        }
        char ch = str.charAt(0);
        String res ="";
        res = res + ch;
        int max = 1;
        for(int i = 1; i < n; i++){
            ch = str.charAt(i);
            int idx = res.indexOf(ch);
            if(idx == -1){
                res = res + ch;
                max = Math.max(max, res.length());
            }
            else{
                res = res.substring(idx + 1) + ch;
            }
        }
        return max;
    }
}