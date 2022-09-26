class Solution {
    public boolean find132pattern(int[] arr) {
    Stack<Integer> st = new Stack<>();
     int n = arr.length;
        int [] min = new int[n];
        min [0] = arr[0];
        for(int i = 1; i < n; i ++){
            min[i] = Math.min(arr[i] , min [i - 1]);
            
        }
        for(int j = n - 1; j >= 0; j --){
            if(arr [j] > min [j]){
                while(st.size() > 0 && st.peek() <= min[j]){
                    st.pop();
                }
                if(st.size() > 0 && st.peek() < arr[j]){
                    return true;
                }
                st.push(arr[j]);
            }
        }
        return false;
    }
}
//     int n = arr.length;
//         if (n < 3) {
//             return false;
//         }

//         for (int i = 0; i < n - 2; i++) {
//             for (int j = i + 1; j < n - 1; j++) {
//                 for (int k = j + 1; k < n; k++) {
//                     if (arr[i] < arr[k] && arr[k] < arr[j]) {
//                         return true;
//                     }
//                 }
//             }
//         }

//         return false;
//     }
// }