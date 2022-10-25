class Solution {
    public char findTheDifference(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int sum2 = 0;
        int sum1 = 0;
        for(int i = 0; i < n; i++){
            sum1 += (int)str1.charAt(i);
        }
        for(int i = 0; i < m; i++){
            sum2 += (int)str2.charAt(i);
        }
        return (char)(sum2 - sum1);
    }
}
