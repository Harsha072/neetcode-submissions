class Solution {
    public int[] getConcatenation(int[] nums) {
          int n = 2 *nums.length;
        int k = nums.length+1;
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int num : nums) {
            list.add(num);
        }
        for (int num : nums) {
            list.add(num);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}