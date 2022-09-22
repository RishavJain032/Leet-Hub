class Solution {
    public int findMaxLength(int[] arr) {
       int res = 0;
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = 0;
        hm.put(0,-1);
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                sum += -1;
            }
                else if(arr[i] == 1){
                    sum += 1;
                }
                if(hm.containsKey(sum)){
                    int idx = hm.get(sum);
                    int l = i - idx;
                    if(l > res){
                        res = l;
                    }
                }
                else{
                    hm.put(sum,i);
                }
            }
        return res;
    }
}