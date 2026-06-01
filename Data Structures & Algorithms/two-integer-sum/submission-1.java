class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // map.put(0,-1);

        for(int i = 0; i < nums.length; i++){
            int pre = target - nums[i];
            if(map.containsKey(pre)){
                return new int[] {map.get(pre), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
