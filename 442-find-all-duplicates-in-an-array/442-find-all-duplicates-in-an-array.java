class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> res = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {  
            int idx = Math.abs(arr[i]) - 1;            
            if (arr[idx] < 0) 
                res.add(idx + 1);            
            arr[idx] *= -1; 
        }
        
        return res;
    }
}