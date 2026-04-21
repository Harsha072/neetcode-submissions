class Solution {
    public int[] productExceptSelf(int[] nums) {
         int pref = 1;
        int [] result = new int[nums.length];
        result[0]=1;

        for (int i = 1; i <nums.length ; i++) {
            result[i] = pref * nums[i-1];
            pref = result[i];
        }

        int post = 1;
        for (int i = nums.length-1; i>=0 ; i--) {
            result[i] = result[i]*post;
            post = nums[i] *post;
        }

        for (int i = 0; i <result.length ; i++) {
            System.out.println(result[i]);
        }
        return result;
    }
}  
