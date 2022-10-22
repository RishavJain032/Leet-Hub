class Solution {
    public static int findDigit(int n){
        int count = 0;
        while(n > 0){
            count ++;
            n = n /10;
        }
        return count;
    }
    public int findNumbers(int[] arr) {
      int res = 0;
        for(int n: arr){
            int count  = findDigit(n);
            if(count % 2 == 0)
                res ++;
            
        }
        return res;
    }
    
}
 