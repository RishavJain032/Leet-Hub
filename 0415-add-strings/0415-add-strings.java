class Solution {
    public String addStrings(String str1, String str2) {
    int i = str1.length() - 1;
        int j = str2.length() - 1;
        int carry = 0;
        StringBuilder sb = new  StringBuilder();
        while(i >= 0 || j >= 0 || carry != 0){
            int n1 = i >= 0 ? str1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? str2.charAt(j) - '0' : 0;
            i --;
            j--;
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);
        }
        return sb.reverse().toString();
    }
}
 