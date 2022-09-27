class Solution {
    public int firstUniqChar(String str) {
        int res = Integer.MAX_VALUE;
        for (char i = 'a'; i <= 'z';i++) {
            int idx = str.indexOf (i);
            if (idx != -1 && idx == str.lastIndexOf (i))
                res = Math.min (res,idx);
        }
        if (res == Integer.MAX_VALUE)
            return -1;
        return res;
    }
}