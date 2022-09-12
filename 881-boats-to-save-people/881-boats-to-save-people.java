class Solution {
    public int numRescueBoats(int[] arr, int a) {
//     arr = people , a = limit;
        int n = arr.length;
        Arrays.sort(arr);
        int i = 0;
        int j = n - 1;
        int count = 0;
        while(i <= j ){
            int light = arr[i];
            int heavy = arr[j];
            if(arr[i] + arr[j] <= a){
                count++;
            i++;
            j--;
        }
        else{
            j--;
            count++;
        }
      }
        return count;
   }
}