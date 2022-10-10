class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int  i = 0; i < n; i++){
            if(arr[i] <= 0){
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < arr[i] * -1)
                st.pop();
                if(!st.isEmpty() && st.peek() == arr[i] *-1)
                    st.pop();
                else if(!st. isEmpty() && st.peek() >= -1 * arr[i])
                    continue;
                else
                    st.push(arr[i]);
            }
            else
                st.push(arr[i]);
        }
       int m = st.size();
        int res[] = new int[m];
        for(int i = m - 1; i >= 0; i--)
            res[i] = st.pop();
        return res;
    }
}