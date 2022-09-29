class Solution {
    public int longestValidParentheses(String str) {
        int n = str.length();
        Stack<Integer> st = new Stack<>();
        int maxLength = 0;
        st.push(-1);
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(i);
            }
            else{
                if(ch == ')'){
                    st.pop();
                    if(st.size() == 0){
                        st.push(i);
                    }
                    else{
                        int len = i - st.peek();
                        maxLength = Math.max(len, maxLength);
                    }
                }
            }
        }
        return maxLength;
    }
}