class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
        int n = arr1.length,m = arr2.length;
        int[] res = new int[n]; 
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = m - 1; i >= 0; i--) {
           
            while(!stack.isEmpty() && stack.peek() <= arr2[i]) {
                stack.pop();
            }
            if(stack.isEmpty()){
                map.put(arr2[i], -1);
            }
            else{ 
                map.put(arr2[i], stack.peek());
            }
            stack.push(arr2[i]);
        }
        
        for(int i = 0; i < n; i++) {
            res[i] = map.get(arr1[i]);
        }
        
        return res;
    }
}