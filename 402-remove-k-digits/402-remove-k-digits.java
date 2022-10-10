class Solution {
    public String removeKdigits(String str, int k) {
        int n = str.length();
        if(k == n){
            return "0";
        }
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i < n){
            while(k > 0 && !st.isEmpty() && st.peek() > str.charAt(i)){
                st.pop();
                k --;
            }
            st.push(str.charAt(i));
            i ++;
        }
        while(k > 0 && !st.isEmpty()){
            st.pop();
            k --;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        while(sb.toString(). startsWith("0")){
            sb.deleteCharAt(0);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}