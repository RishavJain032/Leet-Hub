class Solution {
    public boolean isIsomorphic(String str, String str1) {
        if(str.length() != str1.length())
            return false;
        int n = str.length();
        HashMap<Character , Character> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            char a = str.charAt(i);
            char b = str1.charAt(i);
            if(hm.containsKey(a)){
                if(b != hm.get(a))
                    return false;
            }
            else{
                if(hm.containsValue(b))
                    return false;
                hm.put(a ,b);
            }
        }
        return true;
    }
}