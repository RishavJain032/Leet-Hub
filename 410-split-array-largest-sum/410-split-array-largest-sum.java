class Solution {
public static boolean isPossible(int[]arr,int mid,int m){
        int n = arr.length;
//         sa = sub array
        int sa = 1;
        int sum = 0;
            for(int i = 0; i < n; i++){
                sum += arr[i];
                if(sum > mid){
                    sa++;
                    sum = arr[i];
                }
            }
        return sa <= m;
    }
    public int splitArray(int[] arr, int m) {
        int n = arr.length;
        int max = 0;
        int sum = 0;
          for(int val : arr){
            sum += val;
              max = Math.max(val,max);
        }
          if(m == n){
            return max;
        }
//         si = starting array ei = ending array;
        int si = max;
        int ei = sum;
        int res = 0;
           while(si <= ei){
             int mid = si + (ei - si) / 2;
                if(isPossible(arr,mid,m) == true){
                 res = mid;
                   ei = mid - 1;
            }
            else{
                si = mid + 1;
            }
        }
        return res;
    }
 
}