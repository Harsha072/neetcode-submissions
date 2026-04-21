class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i <nums.length ; i++) {
            count.put(nums[i], count.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: count.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        List<Integer> keys = new ArrayList<>(count.keySet());
        keys.sort((a,b)-> count.get(b) - count.get(a));

        int [] result = new int[k];
        for (int i = 0; i <k ; i++) {

            result[i] = keys.get(i);
        }


       return result;
    }
}
