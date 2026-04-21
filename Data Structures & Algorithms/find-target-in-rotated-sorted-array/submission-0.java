class Solution {
    public int search(int[] nums, int target) {
        int l = 0 ;
         int r = nums.length-1;

         while(l<=r){
             int mid = (l+r)/2;

             if(nums[mid] == target){
                 return mid;
             }
             if(nums[l] <= nums[mid]){  // left half sorted
                 if(nums[l] <= target && target < nums[mid]){
                     r = mid - 1;  // search left
                 } else {
                     l = mid + 1;  // search right
                 }
             } else {  // right half sorted
                 if(nums[mid] < target && target <= nums[r]){
                     l = mid + 1;  // search right
                 } else {
                     r = mid - 1;  // search left
                 }
             }
         }
         return -1; 
    }
}
