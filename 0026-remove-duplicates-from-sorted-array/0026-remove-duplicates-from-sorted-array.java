class Solution {
    public static void swap(int arr[],int i,int j){
      int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int removeDuplicates(int[] arr) {
    int n = arr.length;
        if(n == 1)
            return 1;
        
        int res = 1;
        while(res < n && arr[res] != arr[res - 1]){
            res++;
        }
        
        if(res == n)
            return res;
        
        int i = res + 1;
        
        while(i < n){
            if(arr[i] != arr[res - 1]){
                swap(arr,res,i);
                res++;
            }
            i++;
        }
        
        return res;
    }
}
