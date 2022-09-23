class Solution {
    public String frequencySort(String str) {
        HashMap<Character,Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray())
            hm.put(ch,hm.getOrDefault(ch,0) + 1);
        int n = str.length();
        ArrayList<Character>[] arl = new ArrayList[n + 1];
        for(char ch : hm.keySet()){
            int freq = hm.get(ch);
            if(arl[freq] == null)
                arl[freq] = new ArrayList<Character>();
            arl[freq].add(ch);
        }
        for(int i = n; i >= 0; i--){
            if(arl[i] != null){
                for(char ch : arl[i]){
                    for(int j = 0; j < i; j ++)
                        sb.append(ch);
                }
            }
        }
            return sb.toString();
    }
}