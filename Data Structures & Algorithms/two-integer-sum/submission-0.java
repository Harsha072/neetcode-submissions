class Solution {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer, Integer> map = new HashMap<>();
    
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        
        // Check if complement exists in map
        if (map.containsKey(complement)) {
            // Found the pair! Return both indices
            return new int[]{map.get(complement), i};
        }
        
        // Store current number and its index
        map.put(nums[i], i);
    }
    
    // No solution found (shouldn't happen per problem constraints)
    return new int[]{};   
    }
}
