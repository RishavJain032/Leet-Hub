class Solution {
    public int[] intersect(int[] arr, int[] arr1) {
      Stack<Integer> st = new Stack<>();
	   int count = 0;
        int n = arr.length, m = arr1.length; 
	for(int i = 0; i < m; i ++){
		for(int j = 0; j < n; j ++){
			if(arr1[i] == arr[j]){
				arr[j] = -1;
				st.push (arr1 [i]);
				count ++;
				break;
			}
		}
	} 
	int arr2[]= new int[count];
	for(int i = 0; i < count; i ++){
		arr2[i] = st.pop();
	}
	return arr2;
    }
}
