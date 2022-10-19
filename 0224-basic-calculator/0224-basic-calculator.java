class Solution {
    public int calculate(String str) {
        int sum = 0;
        int sign = 1;
        int n = str.length();
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
        if(Character.isDigit(ch)){
            int val = 0;
            while(i < n && Character.isDigit(str.charAt(i))){
                val = val * 10 + (str.charAt(i) - '0');
                i++;
               }
            i--;
            val = val * sign;
            sign = 1;
            sum += val;
            }
            else if(ch == '('){
                st.push(sum);
                st.push(sign);
                sum = 0;
                sign = +1;
            }
            else if(ch == ')'){
                sum *= st.pop();
                sum += st.pop();
            }
            else if(ch == '-'){
                sign *= -1;
            }
        }
        return sum;
    }
}