public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int len1 = a.length(), len2 = b.length();
        int carrier = 0;
        for(int i = 1; i <= Math.max(len1, len2); i++) {
            int num1 = i <= len1 ? a.charAt(len1 - i) - '0' : 0, num2 = i <= len2? b.charAt(len2 - i) - '0':0;
            int cur = num1 ^ num2 ^ carrier;
            carrier = num1 + num2 + carrier > 1? 1:0;
            sb.append(cur);
        }
        if(carrier == 1) {
            sb.append(carrier);
        }
        return sb.reverse().toString();
    }
}