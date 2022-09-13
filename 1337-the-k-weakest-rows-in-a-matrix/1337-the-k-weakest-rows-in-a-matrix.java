class Solution {
     public int getPower(int[] arr) {
        int si = 0, ei = arr.length - 1, res = -1;
        while(si <= ei) {
            int mid = si + (ei - si) / 2;
            if(arr[mid] == 1) {
                res = mid;
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return res + 1;
    }
     class Pair implements Comparable<Pair>{
        int power;
        int rowNo;

        public Pair(int power, int rowNo) {
            this.power = power;
            this.rowNo = rowNo;
        }   

        @Override
        public int compareTo(Pair other) { //asc -> this - other else other - this
            if(this.power == other.power) 
                return other.rowNo - this.rowNo;
            return other.power - this.power; 

        }
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i = 0; i < mat.length; i ++) {
            int power = getPower(mat[i]);
            Pair pairKaObj = new Pair(power, i);
            pq.add(pairKaObj);
            if(pq.size() > k) {
                pq.remove();
            }
        }

        int ans[] = new int[k], idx = k - 1;
        while(!pq.isEmpty()) {
            Pair obj = pq.remove();
            ans[idx] = obj.rowNo;
            idx --;
        }
        return ans;
    }   
}