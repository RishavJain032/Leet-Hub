class Solution {
    public int maxPower(String str) {
        int n = str.length();
        int count = 0;
        int curr = 1;
        for(int i = 0; i < n; i++){
            if(i < n - 1 && str.charAt(i) == str.charAt(i + 1)){
                curr ++;
                
            }
            else{
                if(curr > count){
                    count = curr;
                }
                curr = 1;
            }
        }
        return count;
    }
}