class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        int count = 1;
        int max = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] == max){
                count ++;
            }
            else{
                count --;
            }
            if(count ==0){
                
            max = arr[i];
                count = 1;
            }
        }
        return max;
    }
}