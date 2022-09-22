class Solution {
    public int longestPalindrome(String str) {
       int len = 0;
        HashSet<Character> hs = new HashSet<>();
        int n = str.length();
        for(int i = 0; i < n; i++){
         char ch = str.charAt(i);
            if(hs.contains(ch)){
// If hset contains character already,move that character & adding 2 to length
                len +=2;// menas we get character which is used in palindrome;
                hs.remove(ch);
            }
            else{
                hs.add(ch);
            }
        }
        if(hs.size() > 0){
            len++;
        }
        return len;
    }
}
