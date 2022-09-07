class Solution {
    public boolean judgeSquareSum(int c) {
//         si = Starting index, ei = ending index
       long si = 0;
        long ei = (long)Math.sqrt(c);
            while(si <= ei){
                if(si * si + ei * ei == c){
                    return true;
                }
                else if(si * si + ei * ei > c){
                    ei--;
                }
                else {
                    si++;
                }
            }
        return false;
    }
}