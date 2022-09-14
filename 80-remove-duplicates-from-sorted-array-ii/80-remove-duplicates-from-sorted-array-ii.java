class Solution {
    public int removeDuplicates(int[] arr) {
       int count = 1;
        int n = arr.length;
    boolean present = false; 
    for(int i = 1; i < n; i++){
        if(arr [i] == arr [i - 1]){
            if(present == false){
              arr[count ++] = arr[i];
                present = true;
               }
           }
         else{
            arr[count ++] = arr [i];
            present = false;
        }
      }
    return count;
  }
}
