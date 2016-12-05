public class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int i = -words.length, j = -words.length;
        int rst = words.length;
        for(int k = 0; k < words.length; k++) {
            String cur = words[k];
            if(cur.equals(word1)) {
                i = k;
            } else if (cur.equals(word2)) {
                j = k;
            } else {
                continue;
            }
            rst = Math.min(rst, Math.abs(i - j));
        }
        return rst;
    }
}