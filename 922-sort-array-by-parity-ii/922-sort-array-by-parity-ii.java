class Solution {
             public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int[] sortArrayByParityII(int[] arr) {
        int n = arr.length, itr = 1;
       for(int i = 0; i < n; i+=2){
           if(arr[i] % 2 == 1){
            while(arr[itr] % 2 == 1)
                itr +=2;
             swap(arr,i, itr); 
           }
       }
        return arr;
    }
}
