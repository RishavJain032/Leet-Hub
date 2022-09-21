class Solution {
    public int longestConsecutive(int[] arr) {
        HashMap<Integer,Boolean> hm = new HashMap<>();
        int res = 0;
        for(int n : arr){
            hm.put(n,true);
        }
        for(int n : arr){
            if(hm.containsKey(n - 1)){
                hm.replace(n,false);
            }
        }
        for(int n : arr){
            if(hm.get(n)){
                int len = 1;
                while(hm.containsKey(n + len)){
                    len ++;
                }
                if(res < len){
                    res = len;
                }
            }
        }
        return res;
    }
}