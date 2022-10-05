class Solution {
     class Pair{
        int val;
        int ele;
        Pair(int val,int ele){
            this.val = val;
            this.ele = ele;
        }
    }
    public int totalSteps(int[] arr) {
        int n = arr.length;
        Stack<Pair> st = new Stack<>();
        int res = 0;
        for(int i = n - 1; i >= 0; i --){
            int steps = 0;
            while(st.size() > 0 && st.peek().val < arr[i]){
                steps = Math.max(steps + 1, st.peek().ele);
                st.pop();
            }
            res = Math.max(res,steps);
            st.push(new Pair(arr[i],steps));
        }
        return res;
    }
}