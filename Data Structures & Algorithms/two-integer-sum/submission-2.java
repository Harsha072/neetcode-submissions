class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []indexArray = new int[2];
          HashMap<Integer, Integer> index = new HashMap<>();
            for (int i = 0; i <nums.length ; i++) {
                int difference = target-nums[i];
                if(index.containsKey(difference)){
                    indexArray[0]=index.get(difference);
                    indexArray[1]=i;
                 break;
                }else{
                    index.put(nums[i], i);
                }
            }
            return indexArray;
    }
}