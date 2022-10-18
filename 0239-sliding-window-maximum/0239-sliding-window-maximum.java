class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
    int [] res = new int [n - k + 1];
        Stack<Integer> st = new Stack<>();
        int nge[] = new int [n];
//         nge = next greater element
        st.push(n - 1);
        nge[n - 1] = n;
        for(int i = n - 2; i >= 0; i--){
            while(st.size() > 0 && arr[i] >= arr[st.peek()]){
                st.pop();
                
            }
            if(st.size() == 0){
                nge[i] = n;
            }
            else{
                nge[i] = st.peek();
            }
            st.push(i);
        }
        int j = 0;
        for(int i = 0; i <= n - k; i++){
//             enter the loop to find the maximum of window starting at i
            if(j < i){
                j = i;
            }
            while(nge[j] < i + k){
                j = nge[j];
            }
            res[i] = arr[j];
        }
        return res;
    }
}
