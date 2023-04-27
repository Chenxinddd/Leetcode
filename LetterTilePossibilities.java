class Solution {
    public int numTilePossibilities(String tiles) {
        boolean[] test = new boolean[tiles.length()];
        HashSet<String> set = new HashSet<>();
        backTracking(tiles, "", test, set);
        return set.size()-1;
    }
    public void backTracking(String tiles, String current, boolean[] test, HashSet<String> set){
        set.add(current);
        for(int i = 0; i < tiles.length(); i++){
            if(!test[i]){
                test[i] = true;
                backTracking(tiles, current + tiles.charAt(i), test, set);
                test[i] = false;
            }
        }
    }
}