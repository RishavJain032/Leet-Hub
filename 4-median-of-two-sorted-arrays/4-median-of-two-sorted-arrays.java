class Solution {
    public double findMedianSortedArrays(int[] arr, int[] arr1) {
        int n = arr.length + arr1.length;
        int merge[] = new int [n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < arr.length && j < arr1.length){
            if(arr[i] < arr1[j]){
                merge[k] = arr[i];
                i++;
                k++;
            }
            else{
                merge[k] = arr1[j];
                j++;
                k++;
            }
        }
        while(i < arr.length){
            merge[k] = arr[i];
            i++;
            k++;
        }
        while(j < arr1.length){
            merge[k] = arr1[j];
            j++;
            k++;
        }
        double median = 0.0;
        int mid = merge.length / 2;
        if(merge.length % 2 == 1){
            median = merge[mid];
        }
        else{
            median = (merge[mid] + merge[mid - 1]) / 2.0;
        }
        return median;
    }
}