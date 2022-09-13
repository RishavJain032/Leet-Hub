class Solution {
    public int firstUniqChar(String str1) {
        char str[] = str1.toCharArray();
        int[] freqarr = new  int [256];
        for(int i = 0; i < str.length; i ++){
            freqarr[str[i] - 'a'] ++;
        }
        for(int i = 0; i < str.length; i++){
            if(freqarr[str [i] - 'a'] == 1)
                return i;
        }
        return -1;
    }
}