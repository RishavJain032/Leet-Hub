class Solution {
    public int[] intersection(int[] arr, int[] arr1) {
       int n = arr.length, m = arr1.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < n; i++){
          hs.add(arr[i]);  
        }
        HashSet<Integer> hs1 = new HashSet<>();
        for(int i = 0; i < m; i++){
            if(hs.contains(arr1[i])){
                hs1.add(arr1[i]);
                hs.remove(arr1[i]);
            }
        }
        int [] arr2 = new  int [hs1.size()];
        int idx = 0;
        for(int i : hs1){
            arr2[idx++] = i;
        }
        return arr2;
    }
}