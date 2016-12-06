public class Solution {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int cnt = Integer.MAX_VALUE;
        Integer pos1 = null, pos2 = null;
        for(int i = 0; i < words.length; i++) {
            String cur = words[i];
            if(cur.equals(word1)) {
                if(word1.equals(word2)) {
                    pos2 = pos1;
                }
                pos1 = i;
            } else if(cur.equals(word2)){
                pos2 = i;
            } else {
                continue;
            }
            if(pos2 != null && pos1 != null) {
                cnt = Math.min(cnt, Math.abs(pos2 - pos1));
            }
        }
        return cnt;
    }
}