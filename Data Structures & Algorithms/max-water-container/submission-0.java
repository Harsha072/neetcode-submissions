class Solution {
    public int maxArea(int[] heights) {
         int l = 0;
        int r  = heights.length-1;
        int area = 0;
        int res = 0;
        while(l<r){
            area = (r-l)* Math.min(heights[l], heights[r]);
            res = Math.max(res, area);

            if(heights[l]<heights[r]){
                l++;
            }
            else if(heights[l]>heights[r]){
                r--;
            }
            else{
                r--;
            }
        }
        return res;
    }
}
