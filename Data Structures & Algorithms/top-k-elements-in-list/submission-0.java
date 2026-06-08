class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
       HashMap<Integer, Integer> count = new HashMap<>();
       List<Integer>[] bucket = new ArrayList[n + 1];

       for(int num : nums){
        count.put(num, count.getOrDefault(num, 0) + 1);
       }

       for(int i = 0; i < bucket.length; i++){
        bucket[i] = new ArrayList<>();
       }

       for(Map.Entry<Integer, Integer> entry :
        count.entrySet()){
            bucket[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;
        for(int i = bucket.length - 1; i >= 0 && index < k; i-- ){
            for(int num : bucket[i]){
                result[index++] = num;
                if(index == k){
                return result;
            }
            }
            
        }
        return result;
    }
}
