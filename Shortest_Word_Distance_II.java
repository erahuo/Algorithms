public class WordDistance {
    Map<String, List<Integer>> dict = new HashMap<>();
    
    public WordDistance(String[] words) {
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            List<Integer> list = null;
            if(dict.containsKey(word)) {
                list = dict.get(word);
            } else {
                list = new ArrayList<>();
                dict.put(word, list);
            }
            list.add(i);
        }
    }

    public int shortest(String word1, String word2) {
        int cnt = Integer.MAX_VALUE;
        List<Integer> list1 = dict.get(word1), list2 = dict.get(word2);
        int i = 0, j = 0;
        while(i < list1.size() && j < list2.size()) {
            int num1 = list1.get(i), num2 = list2.get(j);
            if(num1 < num2) {
                cnt = Math.min(cnt, num2 - num1);
                i++;
            } else {
                cnt = Math.min(cnt, num1 - num2);
                j++;
            }
        }
        return cnt;
    }
}

// Your WordDistance object will be instantiated and called as such:
// WordDistance wordDistance = new WordDistance(words);
// wordDistance.shortest("word1", "word2");
// wordDistance.shortest("anotherWord1", "anotherWord2");