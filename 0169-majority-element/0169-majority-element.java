class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
         for(int e : arr){
             if(hm.containsKey(e)){
                 hm.put(e,hm.get(e) + 1);
                 
             }
             else{
                 hm.put(e , 1);
             }
         }
        int count = 0;
        for(int j : hm.keySet()){
            if(hm.get(j) > n / 2)
            return j;
        }
        return -1;
    }
}