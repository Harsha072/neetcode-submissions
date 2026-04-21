class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;
        for (int i = 0; i <nums.length ; i++) {
           if(!set.contains(nums[i]-1)){
               int count = 0;
               while(set.contains(nums[i]+count)){
                   count += 1;
               }
               longest = Integer.max(longest, count);
           }

        }
        return longest;
    }
}
