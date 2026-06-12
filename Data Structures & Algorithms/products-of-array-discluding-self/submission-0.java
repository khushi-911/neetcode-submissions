class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int pre = 1;
        result[0] = 1;
        for(int i = 1; i < n; i++){
            pre *= nums[i - 1];
            result[i] = pre;
        }

        int suff = 1;
        for(int i = n - 2; i >= 0; i--){
            suff *= nums[i + 1];
            result[i] *= suff;
        }
        return result;
    }
}  
