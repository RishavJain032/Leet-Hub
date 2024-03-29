class Solution {
    public String shiftingLetters(String str, int[] arr) {
       int n  = arr.length;
        for(int i = n - 2; i >=0; i--){
            arr[i] = (arr[i] + arr[i + 1]) % 26;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            ch -= 'a';
            int shift = arr[i] + (int) ch;
            shift %= 26;
            int res = shift + (int) 'a';
            sb.append((char) res);
        }
        return sb.toString();
    }
}