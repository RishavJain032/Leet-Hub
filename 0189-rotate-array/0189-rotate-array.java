class Solution {
    public static void swap(int arr[],int  i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void reverseInRange(int arr[],int lb, int rb){
        while(lb < rb){
            swap(arr,lb++, rb --);
        }
    }
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        reverseInRange(arr, 0 , n - 1);
        reverseInRange(arr, 0, k - 1);
        reverseInRange(arr, k , n - 1);
    }
}