class Solution {
    public boolean hasDuplicate(int[] nums) {
          HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;  // Found a duplicate!
            }
            set.add(nums[i]);
        }

        return false;
    }
}