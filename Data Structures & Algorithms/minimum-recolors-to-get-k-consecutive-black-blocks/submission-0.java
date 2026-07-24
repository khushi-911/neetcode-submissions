class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;
        int min = Integer.MAX_VALUE;
        int l = 0;

        for (int r = 0; r < blocks.length(); r++) {
            if (blocks.charAt(r) == 'W') {
                count++;
            }
            if (r - l + 1 > k) {
                if (blocks.charAt(l) == 'W') {
                    count--;
                }
                l++;
            }
            if (r - l + 1 == k) {
                min = Math.min(min, count);
            }
        }
        return min;
    }
}