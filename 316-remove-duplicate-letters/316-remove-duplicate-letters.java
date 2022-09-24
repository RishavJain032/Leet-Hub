class Solution {
    public String removeDuplicateLetters(String str) {
     Stack<Character> st = new Stack<>();
        int freq[] = new int [26];
        boolean flag[] = new boolean[26];
        int n = str.length();
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            freq[ch - 'a']--;
            if(flag[ch - 'a'])
            continue;
            while(st. size() > 0 && st.peek() > ch && freq[st.peek() - 'a'] > 0){
                char rem = st.pop();
                flag[rem - 'a'] = false;
            } 
            st.push(ch);
            flag[ch - 'a'] = true;
        }
        char res[] = new char[st. size()];
        int i = res.length - 1;
        while(i >= 0)
        res[i --] = st.pop();
        return new String(res);
    }
}