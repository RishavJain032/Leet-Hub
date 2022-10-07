class Solution {
    public static String removeDuplicates(String str) {
        Stack<Character> st = new Stack();
        
        //iterate thru string
        for (char ch : str.toCharArray()) {
            //check if top of stack is equal to this character
            if (!st.isEmpty() && st.peek() == ch) {
                //remove
                st.pop();
            } else {
               //add to stack
                st.push(ch);
            }
        }
        
        //string builder for result
        StringBuilder sb = new StringBuilder();
        
        //empty stack out (everything left is not an adjacent duplicate)
        while (!st.isEmpty()) sb.append(st.pop());
        
        //result
        return sb.reverse().toString();
    }
}