class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int length = 0;
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(start <= map.get(s.charAt(i))){
                    start = map.get(s.charAt(i)) + 1;
                }
            }
            map.put(s.charAt(i), i);
            length = Math.max(length, (i-start + 1));
        }
        return length;
    }
}