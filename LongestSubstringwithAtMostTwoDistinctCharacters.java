class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int size = 0;
        int max = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), i);
            if(map.size() > 2){
                // new way to get the mini values of hashmap
                int delet_Ch = Collections.min(map.values());
                map.remove(s.charAt(delet_Ch));
                left = delet_Ch + 1; 
            }
            max = Math.max(max, i - left + 1);
        }
        return max;
        
    }
}