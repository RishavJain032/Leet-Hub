class Solution {
    public List<Integer> partitionLabels(String str) {
        ArrayList<Integer> al = new ArrayList<>();
        int [] freq = new int [26];
        int n = str.length();
        for(int  i = 0; i < n; i++)
        freq[str.charAt(i) - 'a'] = i;
        int maxLength = 0;
        int tempLength = -1;
        for(int i = 0; i < n; i++){
        maxLength = Math.max(maxLength , freq[str.charAt(i) - 'a']);
        if(maxLength == i){
            al.add(maxLength - tempLength);
            tempLength = maxLength;
           }
        }
        return al;
    }
}