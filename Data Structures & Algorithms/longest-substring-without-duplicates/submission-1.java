class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int l = 0, ans = 0;

        for(int r = 0; r < s.length(); r++){
            freq.put(s.charAt(r), freq.getOrDefault(s.charAt(r), 0) + 1);

            while(freq.get(s.charAt(r)) > 1){
                freq.put(s.charAt(l), freq.getOrDefault(s.charAt(l), 0) - 1);
                l = l + 1;
            }
            ans = Math.max(ans, (r - l) + 1);
        }
        return ans;
    }
}
