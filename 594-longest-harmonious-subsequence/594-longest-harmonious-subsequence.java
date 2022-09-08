class Solution {
    public int findLHS(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : arr)hm.put(i, hm.getOrDefault(i , 0) + 1);
            int res = 0;
            for(int i : hm.keySet()){
                if(hm.containsKey(i + 1)){
                    int lohs = hm.get(i) + hm.get(i + 1);
                    res = Math.max(res , lohs);
                }
            }
        return res;
    }
}