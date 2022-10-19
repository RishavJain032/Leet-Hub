class Solution {
    public String longestCommonPrefix(String[] str) {
        int n = str.length;
        if(n == 0){
            return "";
        }
        String Prefix  = str[0];
        for(String s : str){
        int i = 0;
        while(i < Math.min(Prefix.length(), s.length()) && Prefix.charAt(i) == s.charAt(i)){
               i++; 
            }
            Prefix = s.substring(0, i);
        }   
        return Prefix;
    }
}