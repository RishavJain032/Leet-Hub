class Solution {
    public int findDuplicate(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (!hs.add(arr[i])) {
                return arr[i];
            }
        }

        return n;
    }
}
