class Solution {
public static boolean strisPresent(String a, String b , int idx){
                    int i = idx;
                    int j = 0;
                    while(i < a.length() && j < b.length()){
                        if(a.charAt(i) != b.charAt(j)){
                            return false;
                        }
                        i++;
                        j++;
                    }
                    return j == b.length();
    }
    public int strStr(String str, String str1) {
        int i = 0;
        while(i < str.length()){
            if(str.charAt(i) == str1.charAt(0)){
                boolean isPresent = strisPresent(str,str1,i);
                if(isPresent){
                    return i;
                }
            }
            i++;
        }
        return - 1;
    }              
}