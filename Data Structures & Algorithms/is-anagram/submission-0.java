class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] hash = new int[26];

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            hash[ch - 'a'] = hash[ch - 'a'] + 1;
        }

        int j = 0;
        while(j < t.length()){
            char ch = t.charAt(j);
            if(hash[ch - 'a'] != 0){
                hash[ch - 'a'] = hash[ch - 'a'] - 1; 
                j++;
            }else{
                return false;
            }
        }
        return true;
    }
}
